package org.example.service;

import org.example.repository.UserDao;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.example.constant.UserConstants.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    @Mock
    private UserDao userDaoMock;
    @InjectMocks
    private UserServiceImpl out;
    @Test
    public void testCheckUserExist(){
        when(userDaoMock.findAllUsers()).thenReturn(USERS);
        assertTrue(out.checkUserExist(USER_IVAN));
        assertFalse(out.checkUserExist(USER_MIKE));
    }
}