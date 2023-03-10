package org.example.constant;

import org.example.model.User;

import java.util.List;

public class UserConstants {
    public static final User USER_IVAN = new User("Ivan", 23);
    public static final User USER_MAX = new User("Max", 20);
    public static final User USER_ALEX = new User("Alex", 25);
    public static final User USER_BOB = new User("Bob", 31);
    public static final User USER_ALICE = new User("Alice", 19);
    public static final User USER_MIKE = new User("Mike", 24);
    public static final List<User> USERS = List.of(
            USER_IVAN,
            USER_MAX,
            USER_ALEX,
            USER_BOB,
            USER_ALICE
    );
}
