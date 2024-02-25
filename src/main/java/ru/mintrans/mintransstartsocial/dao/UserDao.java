package ru.mintrans.mintransstartsocial.dao;
import java.util.List;
import ru.mintrans.mintransstartsocial.model.User;

public interface UserDao {

    void saveUser(User user);

    User getUserById(long id);

    List<User> getAllUsers();

    void updateUser(User user);

    void deleteUserById(long id);

}
