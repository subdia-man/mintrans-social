package ru.mintrans.mintransstartsocial.controllers;

import org.springframework.web.bind.annotation.*;
import ru.mintrans.mintransstartsocial.model.User;
import ru.mintrans.mintransstartsocial.services.UserService;

import java.net.HttpURLConnection;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

@RestController
public class UsersController {

    UserService userService = new UserService();
    @PostMapping ("/add-user")
    public int add (String firstName, String secondName, String dateOfBirth) throws ParseException {
        userService.add(firstName, secondName, dateOfBirth);
        return HttpURLConnection.HTTP_OK;
    }

    @GetMapping ("/get-user")
    public User get (long id) {
        return userService.get(id);
    }

    @GetMapping ("/get-all-users")
    public List<User> getAll () {
        return userService.getAll();
    }

    @PostMapping ("/update-user")
    public int update (String firstName, String secondName, String dateOfBirth) throws ParseException {
        userService.update(firstName, secondName, dateOfBirth);
        return HttpURLConnection.HTTP_OK;
    }

    @DeleteMapping ("/delete-user")
    public int delete (long id) {
        userService.delete(id);
        return HttpURLConnection.HTTP_OK;
    }
}
