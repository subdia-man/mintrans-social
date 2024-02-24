package ru.mintrans.mintransstartsocial.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mintrans.mintransstartsocial.services.UserService;

@RestController
public class UsersController {

    UserService userService = new UserService();
    @GetMapping("/add-user")
    public int add (String username, int password) {
        return userService.add(username, password);
    }
}