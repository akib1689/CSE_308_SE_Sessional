package com.company.roles;

import com.company.accounts.*;

public class Customer extends BaseUser{
    private Account account;

    public void createAccount(String name, AccountType type, double initialAmount) {
        if (initialAmount < 0) {
            // amount invalid
            return;
        }

        switch (type) {
            case SAVINGS:
                account=new SavingsAccount(name, initialAmount);
                System.out.println("Savings account created for " + name + ". initial amount: " + initialAmount);
                break;
            case STUDENT:
                account=new StudentAccount(name, initialAmount);
                System.out.println("Student account created for " + name + ". initial amount: " + initialAmount);
                break;
            case DEPOSIT:
                if (initialAmount<100000){
                    System.out.println("Could not create Fixed Deposit account for " + name + ". initial amount must be greater than 100,000$");
                    return;
                }
                account=new DepositAccount(name, initialAmount);
                System.out.println("Fixed Deposit account created for " + name + ". initial amount: " + initialAmount);
                break;
            case LOAN:
                account=new LoanAccount(name, initialAmount);
                System.out.println("Loan account created for " + name + ". initial amount: " + initialAmount);
                break;
            default:
                // never going to reach here
                System.out.println("The type of account is invalid");
                break;
        }

        // account created successfully
    }

    public double deposit(double amount) {
        if (account.deposit(amount)){
            System.out.println("Success!" + amount + "$ deposited. Current balance: " + account.getAmount());
            return amount;
        }

        System.out.println("Error! the transaction could not finished.");
        return 0;
    }

    public double withdraw(double amount){
        if (account.withdraw(amount)){
            System.out.println("Success!" + amount + "$ withdrawn. Current balance: " + account.getAmount());
            return amount;
        }
        System.out.println("Error! the transaction could not finished.");
        return 0;
    }

    public void requestLoan(double amount){
        if (account.requestLoan(amount)){
            System.out.println("Success! Requested loan successfully. Sent for approval.");
            return;
        }
        System.out.println("Error! could not request loan of this amount");
    }

    public void checkBalance(){
        System.out.println("Current balance: " + account.getAmount() + " $.");
    }

    public String getName(){
        return account.getOwner();
    }

    public Account getAccount() {
        return account;
    }
}
