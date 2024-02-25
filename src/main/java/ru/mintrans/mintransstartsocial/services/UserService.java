package ru.mintrans.mintransstartsocial.services;

import ru.mintrans.mintransstartsocial.model.User;
import ru.mintrans.mintransstartsocial.dao.UserDao;
import ru.mintrans.mintransstartsocial.dao.UserDaoImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class UserService {
    UserDao dao = new UserDaoImpl();

    public void add (String firstName, String secondName, String dateOfBirth) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse(dateOfBirth);
        User user = new User(firstName, secondName, date);
        dao.saveUser(user);
    }

    public User get (long id) {
        return dao.getUserById(id);
    }

    public List<User> getAll () {
        return dao.getAllUsers();
    }

    public void update (String firstName, String secondName, String dateOfBirth) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse(dateOfBirth);
        User user = new User(firstName, secondName, date);
        dao.updateUser(user);
    }

    public void delete (long id) {
        dao.deleteUserById(id);
    }

}
