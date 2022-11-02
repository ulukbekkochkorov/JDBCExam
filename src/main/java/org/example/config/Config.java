package org.example.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {
    public static  Connection connection;

    public Config() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "2406");
    }

    public static Connection getConnection() {
        return connection;
    }

}
