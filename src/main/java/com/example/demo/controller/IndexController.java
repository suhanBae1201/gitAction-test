package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping
    public String index() {
        return "index123";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/text")
    public String text() {
        return "text";
    }
}
