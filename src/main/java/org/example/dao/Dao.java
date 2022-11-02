package org.example.dao;

import org.example.models.User;

public interface Dao {
    void createUser();
    void saveUser (String name, String lastName, int age);
    String getUserById(Long id);
    void cleanUser(User user);
}
