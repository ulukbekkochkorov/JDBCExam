package org.example;

import org.example.dao.Dao;
import org.example.dao.UserDao;
import org.example.models.User;
import org.example.service.UserServiceImpl;

import java.sql.SQLException;


public class App 
{
    public static void main( String[] args ) throws SQLException {
        UserServiceImpl userService = new UserServiceImpl();
//        userService.createUser();
//        userService.saveUser("Aman", "Usonov", 18);
        userService.getUserById(2l);
//        userService.saveUser(new User("Uson", "Asanov", 20));
//        userService.cleanUser(new User("Uson", "Asanov",20));

    }
}
