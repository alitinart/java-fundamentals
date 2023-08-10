package bank;

import java.util.ArrayList;

public class Account {
    private int id;
    private String name;
    private double annualInterest;
    private double balance;
    private ArrayList<Transaction> transactions;

    public Account(int id, String name, double annualInterest, double balance) {
        this.id = id;
        this.name = name;
        this.annualInterest = annualInterest;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public Account() {
    }

    public void deposit(double amount) {
        this.balance += amount;
        Transaction transaction = new Transaction('D', amount, balance, "Deposit: " + amount + "$");
        this.transactions.add(transaction);
    }

    public void withdraw(int amount) {
        this.balance -= amount;
        Transaction transaction = new Transaction('W', amount, balance, "Withdraw: " + amount + "$");
        this.transactions.add(transaction);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAnnualInterest() {
        return annualInterest;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}
