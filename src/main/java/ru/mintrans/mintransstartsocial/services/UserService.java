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

    public int add (String username, int password) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = "25/12/2022";
        Date date = dateFormat.parse(dateString);

        User user = new User("John", "Kovarsky", date);
        user.setFirstname(username);
        dao.saveUser(user);
        return 0;
    }

}
