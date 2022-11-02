package org.example.service;

import org.example.models.User;

public interface UserService {
    void createUser();
    void saveUser (String name, String lastName, int age);
    User getUserById(Long id);
    void cleanUser(User user);
}
