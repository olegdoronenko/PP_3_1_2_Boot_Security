package ru.kata.spring.boot_security.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping()
    public String index() {
        return "index";
    }

    @GetMapping("/admin")
    public  String admin() {
        return "admin";
    }

    @GetMapping("/user")
    public  String user() {
        return "user";
    }
}
