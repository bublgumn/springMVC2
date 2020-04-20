package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void add(User user);

    void deleteUser(User user);

    void updateUser(User user);

    List<User> listUsers();

    User getUserById(Long id);

    User getUserByEmail(String email);

}
