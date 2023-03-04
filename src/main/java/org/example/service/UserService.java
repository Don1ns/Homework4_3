package org.example.service;

import org.example.model.User;

public interface UserService {
    Boolean checkUserExist(User user);
    User add(User user);
    User remove(User user);
}
