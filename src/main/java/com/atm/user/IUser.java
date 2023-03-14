package com.atm.user;

import com.atm.enums.Roles;

import java.util.Optional;

public interface IUser {
    User createUser(String name, Roles role, String password) throws IllegalArgumentException;
    Optional<User> getUser(String name) throws IllegalArgumentException ;
    Optional<User> Signin(String name, String password);
}
