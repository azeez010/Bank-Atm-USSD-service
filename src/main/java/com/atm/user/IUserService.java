package com.atm.user;

public interface IUserService {
    public User createUser(UserModel userModel);

    public User signIn(UserModel userModel);

    public void credit(User user);

    public void debit(User user);

    public void showUserBalance(User user);

}
