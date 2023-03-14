package com.client.console;

import com.atm.enums.AtmOptions;
import com.atm.user.IUserService;
import com.atm.user.User;
import com.atm.user.UserModel;
import com.atm.user.UserService;
import com.client.Client;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Console implements Client {
    public void run(){
        IUserService userService = new UserService();
        UserModel userModel = new UserModel();
        User user = null;

        while (true) {
            AtomicInteger myCounter = new AtomicInteger();
            Arrays.stream(AtmOptions.class.getDeclaredFields()).forEach((field) -> {
                System.out.printf("%d %s %n", myCounter.incrementAndGet(), field.getName());
            });

            Scanner takeInput = new Scanner(System.in);
            int functionalitiesOrdinal = takeInput.nextInt();
            switch (functionalitiesOrdinal) {
                case AtmOptions.CREATEUSER -> userService.createUser(userModel);
                case AtmOptions.DEPOSIT -> userService.credit(user);
                case AtmOptions.WITHDRAW -> userService.debit(user);
                case AtmOptions.CHECKBALANCE -> userService.showUserBalance(user);
                case AtmOptions.SIGNIN -> {
                    user = userService.signIn(userModel);
                }
            }
        }
    }
}
