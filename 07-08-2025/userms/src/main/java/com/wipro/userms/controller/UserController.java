package com.wipro.userms.controller;

import com.wipro.userms.entity.User;
import com.wipro.userms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public String createUser(@RequestBody User user) {
        userService.save(user);
        return "User Created";
    }
    

    @PutMapping("/{id}")
    public String updateUser(@PathVariable int id, @RequestBody User user) {
        user.setId(id); 
        userService.update(user);
        return "User Updated";
    }


    @GetMapping
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.delete(id);
        return "User Deleted";
    }
}
