package com.wipro.usermgmtv2.service.impl;

import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.List;
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
    private UserRepo userRepo;

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
        if (user.getSalt() == null) {
            user.setSalt(EncryptUtil.generateSalt());
        }
        String encryptedPwd = EncryptUtil.getEncryptedPassword(user.getPassWord(), user.getSalt());
        user.setPassWord(encryptedPwd);
        userRepo.save(user);
    }


    @Override
    public void deleteById(int id) {
        userRepo.deleteById(id);
    }

    @Override
    public Token login(User user) {
        User userSalt = userRepo.findByEmailId(user.getEmailId());
        if (userSalt == null) return null;

        String encrypted = EncryptUtil.getEncryptedPassword(user.getPassWord(), userSalt.getSalt());
        User userData = userRepo.findByEmailIdAndPassWord(user.getEmailId(), encrypted);

        if (userData != null) {
            String jwtToken = "Bearer " + getJWTToken(String.valueOf(userData.getId()), userData.getUserType());

            Token token = new Token();
            token.setToken(jwtToken);
            token.setRole(userData.getUserType() == 0 ? "ADMIN" : "CUSTOMER");
            token.setUserId(userData.getId());
            return token;
        }
        return null;
    }

    private String getJWTToken(String userId, int userType) {
        Key key = Keys.hmacShaKeyFor(Base64.getDecoder().decode(AppConstant.SECRET));
        String role = userType == 0 ? "ROLE_ADMIN" : "ROLE_CUSTOMER";

        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
            .commaSeparatedStringToAuthorityList(role);

        return Jwts.builder()
                .setId("jwtExample")
                .setSubject(userId)
                .claim("authorities", grantedAuthorities.stream()
                                                        .map(GrantedAuthority::getAuthority)
                                                        .collect(Collectors.toList()))
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 86400000)) 
                .signWith(key)
                .compact();
    }

}
