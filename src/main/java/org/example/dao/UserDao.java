package org.example.dao;

import org.example.config.Config;
import org.example.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao implements Dao {
    public Connection connection;

    public UserDao() throws SQLException {
        connection = new Config().getConnection();
    }

    public void createUser() {
        String query = "create table users(id serial primary key, name varchar (50), " +
                "last_name varchar (50), age int)";
        try {
            Statement statement = connection.createStatement();
            statement.execute(query);
            statement.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    public void saveUser(String name, String lastName, int age) {
        String query = "Insert into users (name, last_name, age) values (?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, lastName);
            preparedStatement.setLong(3, age);
            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public String getUserById(Long id) {
        String query = "select * from users where id = " + id;
        try {
            Statement statement = connection.createStatement();
            Boolean user = statement.execute(query);
            System.out.println(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }return null;
    }
    public void cleanUser(User user) {
        String query = "delete frome users";
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}






