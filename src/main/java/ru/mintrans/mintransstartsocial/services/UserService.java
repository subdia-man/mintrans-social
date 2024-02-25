package ru.mintrans.mintransstartsocial.services;

import ru.mintrans.mintransstartsocial.model.User;
import ru.mintrans.mintransstartsocial.dao.UserDao;
import ru.mintrans.mintransstartsocial.dao.UserDaoImpl;
import ru.mintrans.mintransstartsocial.web.dto.CreateUserDto;

import java.net.http.HttpResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserService {
    UserDao dao = new UserDaoImpl();

    public void add (String firstName, String secondName, String dateOfBirth) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse(dateOfBirth);
        User user = new User(firstName, secondName, date);
        dao.saveUser(user);
    }

}
