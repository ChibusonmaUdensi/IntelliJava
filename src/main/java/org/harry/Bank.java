package org.harry;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;
    public Bank() {
        accounts = new ArrayList<>();

    }
    Account acc = new Account( 8888, "33", "Semaj");
    public void addAccount(Account account) {
        accounts.add(account);
    }
    private Account findAccount(int account) {
        for (Account ac : accounts) {
            if (ac.getAccountNumber() == account) {
                return ac;
            }
        }
        throw new RuntimeException("Account not found");
    }
    public void deposit(int amount, int account) {
        findAccount(account).deposit(amount);
    }
    public void withdraw(int account, int amount, String pin) {
        findAccount(account).withdraw(amount, pin);
    }
    public void transferFrom(int fromAccount, int toAccount, int amount, String pin) {
        findAccount(fromAccount).withdraw(amount, pin);
        findAccount(toAccount).deposit(amount);

    }

    public int getAccountNumber() {
        return accounts.size();
    }

    public double checkBalance(String pin, int account) {
        return findAccount(account).checkBalance(pin);
    }

}
