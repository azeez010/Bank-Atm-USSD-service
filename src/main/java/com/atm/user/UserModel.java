package com.atm.user;

import com.atm.enums.Roles;

import java.util.ArrayList;

import java.util.Optional;

public class UserModel implements IUser {
    private ArrayList<User> users = new ArrayList<>();

    @Override
    public User createUser(String name, Roles role, String password) throws IllegalArgumentException {
        if(getUser(name).isPresent())
        {
            new IllegalArgumentException("User name already exist");
        }

        User user = new User(name, role, password);
        users.add(user);
        return user;
    }

    @Override
    public Optional<User> getUser(String name) throws IllegalArgumentException {
        return users.stream().filter((e) -> e.getName().equals(name)).findFirst();
    }

    @Override
    public Optional<User> Signin(String name, String password) {
        if(getUser(name).isPresent()){
            User user = getUser(name).get();
            boolean isEqual = user.getPassword().equals(password);
            if(isEqual){
                user.setSignedIn(true);
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
