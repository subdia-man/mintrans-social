package ru.mintrans.mintransstartsocial.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/greet")
public class GreetingsController {
    @GetMapping
    public String greet() {
        return "Hello";
    }
}
