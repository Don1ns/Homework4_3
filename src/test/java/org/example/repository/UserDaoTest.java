package org.example.repository;

import org.example.model.User;
import org.junit.jupiter.api.Test;

import static org.example.constant.UserConstants.*;
import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    @Test
    public void shouldReturnUserByName() {
        UserDao userDao = new UserDaoImpl();
        userDao.add(USER_IVAN);
        userDao.add(USER_MAX);
        userDao.add(USER_ALEX);
        userDao.add(USER_BOB);
        userDao.add(USER_ALICE);
        assertNotNull(userDao.getUserByName("Ivan"));
        assertEquals(USER_IVAN, userDao.getUserByName("Ivan"));
        assertNull(userDao.getUserByName("Maria"));
    }
}