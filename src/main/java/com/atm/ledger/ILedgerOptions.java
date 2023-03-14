package com.atm.ledger;

import com.atm.exceptions.CreditException;
import com.atm.exceptions.DebitException;

public interface ILedgerOptions {
    public boolean credit(double amount) throws CreditException;

    public boolean debit(double amount) throws DebitException;
}
