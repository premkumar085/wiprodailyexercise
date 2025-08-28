package com.wipro.usermgmtv2.controller;

import com.wipro.usermgmtv2.dto.Token;
import com.wipro.usermgmtv2.entity.User;
import com.wipro.usermgmtv2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	UserService userServie;
	
	@GetMapping
	List<User> findAll()
	{
		return userServie.findAll();
	}
	@GetMapping("/{id}")
	User findById(@PathVariable int id)
	{
		return userServie.findById(id);
	}
	@DeleteMapping("/{id}")
	void deleteById(@PathVariable int id)
	{
		 userServie.deleteById(id);
	}
	@PostMapping("/register")
	void save(@RequestBody User user)
	{
		userServie.save(user);
		
	}
	
	@PutMapping
	void update(@RequestBody User user)
	{
		userServie.save(user);
		
	}
	
	@PostMapping("/login")
	Token login(@RequestBody User user)
	{
		
		return userServie.login(user);
		
	}

}
