package com.wipro.firstboot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.wipro.firstboot1.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "userreg";
    }

    @PostMapping("/submit")
    public String submitRegistration(@ModelAttribute("user") User user) {
        System.out.println(user);
        return "success";
    }
}
