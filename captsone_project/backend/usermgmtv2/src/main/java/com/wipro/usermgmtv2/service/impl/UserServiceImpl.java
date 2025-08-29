package com.wipro.usermgmtv2.service.impl;

import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Service;

import com.wipro.usermgmtv2.dto.Token;
import com.wipro.usermgmtv2.entity.User;
import com.wipro.usermgmtv2.repo.UserRepo;
import com.wipro.usermgmtv2.service.UserService;
import com.wipro.usermgmtv2.util.AppConstant;
import com.wipro.usermgmtv2.util.EncryptUtil;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public User findById(int id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public void save(User user) {
        // generate salt if new
        if(user.getSalt() == null) {
            user.setSalt(org.springframework.security.crypto.bcrypt.BCrypt.gensalt());
        }
        String encrypted = EncryptUtil.getEncryptedPassword(user.getPassWord(), user.getSalt());
        user.setPassWord(encrypted);
        if(user.getRole()==null) user.setRole("ROLE_CUSTOMER"); // default
        userRepo.save(user);
    }

    @Override
    public void deleteById(int id) {
        userRepo.deleteById(id);
    }

    @Override
    public User updateUser(int id, User updated) {
        User existing = userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        existing.setName(updated.getName());
        existing.setEmail(updated.getEmail());
        existing.setRole(updated.getRole());
        if(updated.getPassWord()!=null && !updated.getPassWord().isBlank()){
            String encrypted = EncryptUtil.getEncryptedPassword(updated.getPassWord(), existing.getSalt());
            existing.setPassWord(encrypted);
        }
        return userRepo.save(existing);
    }

    @Override
    public Token login(User user) {
        User userSalt = userRepo.findByEmail(user.getEmail());
        if(userSalt == null) return null;

        String encrypted = EncryptUtil.getEncryptedPassword(user.getPassWord(), userSalt.getSalt());
        User userData = userRepo.findByEmailAndPassWord(user.getEmail(), encrypted);
        if(userData != null) {
            String jwtToken = "Bearer " + getJWTToken(userData);
            Token token = new Token();
            token.setToken(jwtToken);
            return token;
        }
        return null;
    }

    @Override
    public String getMenu(int id) {
        User user = userRepo.findById(id).orElse(null);
        if(user == null) return "NO_ROLE";
        return user.getRole().equals("ROLE_ADMIN") ? "ADMIN_MENU" : "CUSTOMER_MENU";
    }

    private String getJWTToken(User user) {
        Key key = Keys.hmacShaKeyFor(Base64.getDecoder().decode(AppConstant.SECRET));
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList(user.getRole());

        return Jwts.builder()
                .setId("jwtExample")
                .setSubject(String.valueOf(user.getId()))
                .claim("authorities", grantedAuthorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 6000000))
                .signWith(key)
                .compact();
    }
}
