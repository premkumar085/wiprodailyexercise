package com.wipro.usermgmtv2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.usermgmtv2.dto.Token;
import com.wipro.usermgmtv2.entity.User;
import com.wipro.usermgmtv2.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    User findById(@PathVariable int id) {
        return userService.findById(id);
    }

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable int id) {
        userService.deleteById(id);
    }

    @PostMapping
    void save(@RequestBody User user) {
        userService.save(user);
    }

    @PutMapping("/{id}")
    User update(@PathVariable int id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @PostMapping("/login")
    Token login(@RequestBody User user) {
        return userService.login(user);
    }

    @GetMapping("/{id}/menu")
    String getMenu(@PathVariable int id) {
        return userService.getMenu(id);
    }
}
