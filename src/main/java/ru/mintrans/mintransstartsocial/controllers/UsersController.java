package ru.mintrans.mintransstartsocial.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mintrans.mintransstartsocial.services.UserService;

import java.net.HttpURLConnection;
import java.text.ParseException;
import java.util.Date;

@RestController
public class UsersController {

    UserService userService = new UserService();
    @PostMapping("/add-user")
    public int add (String firstName, String secondName, String dateOfBirth) throws ParseException {
        userService.add(firstName, secondName, dateOfBirth);
        return HttpURLConnection.HTTP_OK;
    }
}
