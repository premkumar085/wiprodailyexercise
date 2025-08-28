package com.wipro.usermgmtv2.service.impl;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Service;

import com.wipro.usermgmtv2.dto.Token;
import com.wipro.usermgmtv2.entity.User;
import com.wipro.usermgmtv2.repo.UserRepo;
import com.wipro.usermgmtv2.service.UserService;
import com.wipro.usermgmtv2.util.AppConstant;
import com.wipro.usermgmtv2.util.EncryptUtil;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepo userRepo;

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		
		Optional<User>optUser = userRepo.findById(id);
		if(optUser.isPresent()) {
			return optUser.get();
		}else {
		return null;
		}
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		String password = user.getPassWord();
		String[] passWordSalt = EncryptUtil.getEncryptedPassword(password, null);
		user.setPassWord(passWordSalt[0]);
		user.setSalt(passWordSalt[1]);		
		userRepo.save(user);

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);

	}

	@Override
	public Token login(User user) {
		// TODO Auto-generated method stub
		User userSalt = userRepo.findByUserEmail(user.getUserEmail());
		
		String[] encryptedPassword = EncryptUtil.getEncryptedPassword(user.getPassWord(), userSalt.getSalt());
		
		User userData = userRepo.findByUserEmailAndPassWord(user.getUserEmail(), encryptedPassword[0]);
		if(userData!=null) {
			System.out.println(getJWTToken(userData.getUserEmail()));
			String userId =  String.valueOf(userData.getId());
			System.out.println(userId);
			String jwtToken="Bearer " + getJWTToken(userId);
			System.out.println("token="+jwtToken);
			Token token=new Token();
			token.setToken(jwtToken);
			return token;
		}
		return null;
	}
	
	 private String getJWTToken(String userId) {
	        Key key = Keys.hmacShaKeyFor(Base64.getDecoder().decode(AppConstant.SECRET));
		 	List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");

	        return Jwts.builder()
	                .setId("jwtExample")
	                .setSubject(userId)
	                .claim("authorities", grantedAuthorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
	                .setIssuedAt(new Date())
	                .setExpiration(new Date(System.currentTimeMillis() + 6000000))
	                .signWith(key)
	                .compact();
	    }

}