package ru.mintrans.mintransstartsocial.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/interference")
public class InterferenceController {
    @GetMapping
    public String interference () {
        return "Interference";
    }
}
