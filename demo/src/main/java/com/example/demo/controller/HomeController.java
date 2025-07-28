package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Handles GET request for the root path "/"
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Welcome to My Spring Boot App");
        return "home"; // Renders home.html
    }

    // Optional: Handle about page
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("message", "This is a simple Spring Boot web application.");
        return "about"; // Renders about.html
    }
}
