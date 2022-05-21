package com.company.accounts;

/**
 * composite structure this is the base interface all clients will access the accounts via this classes
 */
public abstract class Account {
    private final String owner;     // In real world it might be another class
    private double amount;
    private double rate;
    private final AccountType type;


    public Account(String owner, double amount, double rate, AccountType type) {
        this.owner = owner;
        this.amount = amount;
        this.rate = rate / 100;
        this.type = type;
    }

    public double getRate() {
        return rate;
    }

    public AccountType getType() {
        return type;
    }

    public void setRate(double newRate) {
        this.rate = newRate / 100;
    }


    protected void setAmount(double amount) {
        this.amount = amount;
    }

    public String getOwner() {
        return owner;
    }

    public double getAmount() {
        return amount;
    }

    public abstract void addInterest();

    public abstract boolean deposit(double amount);

    public abstract boolean withdraw(double amount);

    public abstract boolean requestLoan(double amount);

    public abstract double approveLoan();

    //public abstract double loanAmount();

}
