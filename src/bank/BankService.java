package bank;

import java.util.ArrayList;

public class BankService {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void createAccount(int accNo, String name, double balance) {
        accounts.add(new Account(accNo, name, balance));
        System.out.println("Account created successfully!");
    }

    private Account findAccount(int accNo) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }
        return null;
    }

    public void deposit(int accNo, double amount) {
        Account acc = findAccount(accNo);
        if (acc != null) {
            acc.deposit(amount);
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Account not found!");
        }
    }

    public void withdraw(int accNo, double amount) {
        Account acc = findAccount(accNo);
        if (acc != null) {
            if (acc.withdraw(amount)) {
                System.out.println("Withdrawal successful!");
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Account not found!");
        }
    }

    public void checkBalance(int accNo) {
        Account acc = findAccount(accNo);
        if (acc != null) {
            System.out.println("Balance: " + acc.getBalance());
        } else {
            System.out.println("Account not found!");
        }
    }
}
