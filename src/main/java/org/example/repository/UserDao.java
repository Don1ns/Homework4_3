package org.example.repository;

import org.example.model.User;

import java.util.List;

public interface UserDao {
    User add(User user);
    User remove(User user);
    User getUserByName(String name);
    List<User> findAllUsers();
}
