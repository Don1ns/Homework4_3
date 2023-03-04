package org.example.service;

import org.example.model.User;
import org.example.repository.UserDao;

public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public Boolean checkUserExist(User user){
        return userDao.findAllUsers().contains(user);
    }

    @Override
    public User add(User user) {
        return userDao.add(user);
    }

    @Override
    public User remove(User user) {
        return userDao.remove(user);
    }
}
