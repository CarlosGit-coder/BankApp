package com.bank.bankapp.service;

import com.bank.bankapp.model.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private Account account = new Account(1234, "Cliente", 1000.0);

    public Account getAccount() {
        return account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public boolean withdraw(double amount) {
        return account.withdraw(amount);
    }

    public void changeHolder(String name) {
        account.setHolder(name);
    }
}
