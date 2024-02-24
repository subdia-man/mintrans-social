package ru.mintrans.mintransstartsocial.services;

import ru.mintrans.mintransstartsocial.web.dto.CreateUserDto;

import java.net.http.HttpResponse;

public class UserService {

    public int add (String username, int password) {
        CreateUserDto dto = CreateUserDto.builder()
                .setName(username)
                .setPassword(password)
                .build();
        return 0;
    }

}
