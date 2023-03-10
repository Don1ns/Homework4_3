package org.example.repository;

import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private final List<User> users = new ArrayList<>();

    @Override
    public User add(User user) {
        if (users.contains(user)) {
            throw new RuntimeException();
        }
        users.add(user);
        return user;
    }

    @Override
    public User remove(User user) {
        users.remove(user);
        return user;
    }

    @Override
    public User getUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }
}
