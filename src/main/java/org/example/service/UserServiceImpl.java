package org.example.service;

import org.example.dao.UserDao;
import org.example.models.User;

import java.sql.SQLException;

public class UserServiceImpl implements UserService{
    UserDao userDao = new UserDao();

    public UserServiceImpl() throws SQLException {
    }

    public void createUser() {
        userDao.createUser();
    }

    public void saveUser(String name, String lastName, int age) {
userDao.saveUser(name, lastName, age);
    }

    public User getUserById(Long id) {
        userDao.getUserById(id);
        return null;
    }

    public void cleanUser(User user) {
        userDao.cleanUser(user);

    }
}
