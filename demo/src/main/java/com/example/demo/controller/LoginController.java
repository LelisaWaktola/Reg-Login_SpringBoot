package com.example.demo.controller;


import com.example.demo.model.User;
import com.example.demo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller  //accepts http requests via get o post
public class LoginController {

    @Autowired
    private UserServiceImpl userService;

    // Show login form
    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";  // login.html page
    }

    // Handle login form submit
    @PostMapping("/login")
    public String login(@ModelAttribute("user") User user, Model model) {
        User found =userService.validateUser(user.getEmail(), user.getPassword());

        // if (found != null) {
        //     // Login success
        //     model.addAttribute("name", found.getFullName());
        //     return "welcome";  // welcome.html page
        // } else {
        //     // Login fail
        //     model.addAttribute("error", "Invalid email or password");
        //     return "login";
        // }
        return "welcome";
    }
}
