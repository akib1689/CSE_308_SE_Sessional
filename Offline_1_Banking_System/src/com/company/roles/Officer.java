package com.company.roles;

import com.company.accounts.Account;

import java.util.List;

public class Officer extends Cashier{

    public double approveLoan(List<Account> accounts){
        double total = 0;
        for (Account account: accounts){
            double amount = account.approveLoan();
            if (amount > 0){
                System.out.println("Loan approved! Account holder's name: " + account.getOwner());
                total += amount;
            }
        }

        return total;
    }
}
