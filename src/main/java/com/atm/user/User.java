package com.atm.user;

import com.atm.enums.Roles;
import com.atm.ledger.UserBalance;

public class User {
    private String name;
    private Roles userRoles;
    private String password;
    private boolean signedIn;

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    private UserBalance balance;


    public String getPassword() {
        return password;
    }

    public User(String name, Roles userRoles, String password) {
        this.name = name;
        this.userRoles = userRoles;
        this.password = password;
        this.signedIn = false;
        this.balance = new UserBalance();
    }


    public String getName() {
        return name;
    }

    public UserBalance getBalance() {
        return balance;
    }

    public boolean isSignedIn() {
        return signedIn;
    }
}
