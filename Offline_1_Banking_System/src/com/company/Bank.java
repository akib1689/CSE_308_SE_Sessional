package com.company;

import com.company.accounts.Account;
import com.company.accounts.AccountType;
import com.company.roles.*;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<Customer> customers;
    private BaseUser loggedIn;
    private final ManagingDirector director;
    private final List<Officer> officers;
    private final List<Cashier> cashiers;


    public Bank() {
        customers = new ArrayList<>();
        loggedIn = null;
        director = new ManagingDirector();
        officers = new ArrayList<>();
        cashiers = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Officer officer = new Officer();
            officers.add(officer);
        }

        for (int i = 0; i < 5; i++) {
            Cashier cashier = new Cashier();
            cashiers.add(cashier);
        }

        System.out.println("Bank created");
    }

    private int checkCustomer(String name) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(name)) {
                return i;
            }
        }

        return -1;
    }

    private List<Account> getAccounts() {
        List<Account> accounts = new ArrayList<>();
        for (Customer customer : customers) {
            accounts.add(customer.getAccount());
        }
        return accounts;
    }

    public void createAccount(String name, AccountType type, double initAmount) {
        // check if the customer exists
        if (checkCustomer(name) >= 0) {
            System.out.println("Could not create account. The customer already exists.");
            return;
        }

        Customer customer = new Customer();
        customer.createAccount(name, type, initAmount);
        customers.add(customer);
        loggedIn = customer;
    }

    public void deposit(double amount) {
        if (!(loggedIn instanceof Customer)) {
            System.out.println("You Don't Have the permission for this operation");
            return;
        }
        ((Customer) loggedIn).deposit(amount);
    }

    public void withdraw(double amount) {
        if (!(loggedIn instanceof Customer)) {
            System.out.println("You Don't Have the permission for this operation");

            return;
        }
        ((Customer) loggedIn).withdraw(amount);
    }

    public void checkBalance() {
        if (!(loggedIn instanceof Customer)) {
            System.out.println("You Don't Have the permission for this operation");

            return;
        }
        ((Customer) loggedIn).checkBalance();
    }

    public void reqLoan(double amount) {
        if (!(loggedIn instanceof Customer)) {
            System.out.println("You Don't Have the permission for this operation");

            return;
        }
        ((Customer) loggedIn).requestLoan(amount);
    }

    public void lookupCustomer(String name) {
        if (!(loggedIn instanceof Cashier)) {
            System.out.println("You Don't Have the permission for this operation");
            return;
        }
        int index = checkCustomer(name);
        ((Cashier) loggedIn).seeCustomer(customers.get(index));
    }

    public void approveLoan() {
        if (!(loggedIn instanceof Officer)) {
            System.out.println("You Don't Have the permission for this operation");
            return;
        }
        ((Officer) loggedIn).approveLoan(getAccounts());
    }

    public void changeInterest(AccountType type, double newRate) {
        if (!(loggedIn instanceof ManagingDirector)) {
            System.out.println("You Don't Have the permission for this operation");
            return;
        }

        ((ManagingDirector) loggedIn).changeInterestRate(getAccounts(), type, newRate);
    }

    public void seeFund() {
        if (!(loggedIn instanceof ManagingDirector)) {
            System.out.println("You Don't Have the permission for this operation");
            return;
        }

        ((ManagingDirector) loggedIn).seeFund(getAccounts());
    }

    public void incrementYear() {
        for (Customer c : customers) {
            c.getAccount().addInterest();
        }
        System.out.println("1 year passed!");
    }

    public void loginAsOfficer(int index) {
        if (index > officers.size()) {
            System.out.println("Could not logged in as officer");
            return;
        }
        loggedIn = officers.get(index);
        System.out.println("Successfully logged in as officer");
    }

    public void loginAsCashier(int index) {
        if (index > cashiers.size()) {
            System.out.println("Could not logged in as cashier");
            return;
        }
        loggedIn = cashiers.get(index);
        System.out.println("Successfully logged in as cashier");
    }

    public void loginAsMD() {
        loggedIn = director;
        System.out.println("Successfully logged in as Managing director");
    }

    public void loginAsCustomer(String name) {
        int index = checkCustomer(name);
        if (index < 0) {
            System.out.println("Could not logged in as customer");
        }
        loggedIn = customers.get(index);
        System.out.println("Welcome " + name);
    }

    public void logout(){
        loggedIn = null;
        System.out.println("Session closed!");
    }


}
