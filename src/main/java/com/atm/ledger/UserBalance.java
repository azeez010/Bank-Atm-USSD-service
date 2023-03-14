package com.atm.ledger;

import com.atm.exceptions.CreditException;
import com.atm.exceptions.DebitException;


import java.math.BigDecimal;

public class UserBalance implements ILedgerOptions, IUserBalance {
    private BigDecimal balance = new BigDecimal("0.00");

    @Override
    public boolean credit(double amount) throws CreditException {
        balance = balance.add(BigDecimal.valueOf(amount));
        return true;
    }

    @Override
    public boolean debit(double amount) throws DebitException {
        if(amount > balance.doubleValue()) throw new DebitException("You can withdraw what you don;t have");
        balance = balance.subtract(BigDecimal.valueOf(amount));
        return true;
    }

    @Override
    public String showUserBalance() {
        return String.format("Your account balance is %f %n", balance);
    }
}