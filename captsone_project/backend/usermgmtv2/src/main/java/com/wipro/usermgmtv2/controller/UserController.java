package com.wipro.usermgmtv2.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.usermgmtv2.dto.Token;
import com.wipro.usermgmtv2.entity.User;
import com.wipro.usermgmtv2.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
@Tag(name = "User Management", description = "APIs for managing users and authentication")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    @Operation(summary = "Get all users")
    List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get user by ID")
    User findById(@PathVariable int id) {
        return userService.findById(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete user by ID")
    void deleteById(@PathVariable int id) {
        userService.deleteById(id);
    }

    @PostMapping("/signup")
    @Operation(summary = "Register a new user")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "User registered successfully"),
        @ApiResponse(responseCode = "400", description = "Invalid input")
    })
    void signup(@RequestBody User user) {
        userService.save(user);
    }

    @PutMapping
    @Operation(summary = "Update user details")
    void update(@RequestBody User user) {
        userService.save(user);
    }

    @PostMapping("/login")
    @Operation(summary = "Authenticate user")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Login successful"),
        @ApiResponse(responseCode = "401", description = "Unauthorized")
    })
    Token login(@RequestBody User user) {
        return userService.login(user);
    }
}
