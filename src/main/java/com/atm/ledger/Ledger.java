package com.atm.ledger;

import com.atm.user.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Ledger {
    LocalDateTime transactionDateTime;
    User user;
    BigDecimal amount;
}
