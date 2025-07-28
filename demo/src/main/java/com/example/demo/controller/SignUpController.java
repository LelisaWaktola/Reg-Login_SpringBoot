package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SignUpController {

    @Autowired
    private UserService userService;

    // Show the registration form
    @GetMapping("/signup")
    public String showSignupForm(Model model) {
        model.addAttribute("user", new User());
        return "signup";  // loads signup.html
    }

    // Handle form submission
    @PostMapping("/signup")
    public String processSignup(@ModelAttribute("user") User user, Model model) {
        boolean userExists = userService.userExists(user.getEmail());

        if (userExists) {
            model.addAttribute("error", "User already exists with this email");
            return "signup";
        }

        userService.saveUser(user);
        model.addAttribute("message", "Registration successful! Please log in.");
        return "login";  // after successful signup, redirect to login page
    }
}

