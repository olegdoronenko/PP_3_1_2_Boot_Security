package ru.kata.spring.boot_security.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kata.spring.boot_security.demo.configs.SuccessUserHandler;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping()
    public  String admin() {
        return "admin";
    }
}
