package com.atm.user;

import com.atm.enums.Roles;
import com.atm.exceptions.NotAuthenticationException;
import com.atm.exceptions.SigninException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;
import java.util.Scanner;


public class UserService implements IUserService {
    Scanner scanner = new Scanner(System.in);
    private final Logger log = LoggerFactory.getLogger(UserService.class);

    public User createUser(UserModel userModel){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name;");
        String name = scanner.next();
        System.out.println("What's your password;");
        String password = scanner.next();
        Roles role = Roles.USER;
        log.info("User is Created Username {} Password {}", name, password);
        return userModel.createUser(name, role, password);
    }

    @Override
    public User signIn(UserModel userModel) {
        System.out.println("What's your name;");
        String name = scanner.next();
        System.out.println("What's your password;");
        String password = scanner.next();
        return userModel.Signin(name, password).orElseThrow(() -> new SigninException("Wrong pass or username"));
    }

    @Override
    public void credit(User user) {
        if(Objects.isNull(user)) throw new NotAuthenticationException("User is not Signed in");

        if(user.isSignedIn()) {
            System.out.println("Enter amount you want to deposit;");
            double amount = scanner.nextDouble();
            user.getBalance().credit(amount);
            showUserBalance(user);
            return;
        }

        throw new NotAuthenticationException("User is not Signed in");
    }

    @Override
    public void debit(User user) {

        if(Objects.isNull(user)) throw new NotAuthenticationException("User is not Signed in");

        if(user.isSignedIn()) {
            System.out.println("Enter amount you want to withdraw;");
            double amount = scanner.nextDouble();

            user.getBalance().debit(amount);
            showUserBalance(user);
            return;
        }
        throw new NotAuthenticationException("User is not Signed in, pls signin user");
    }

    @Override
    public void showUserBalance(User user) {
        System.out.println(user.getBalance().showUserBalance());
    }

}
