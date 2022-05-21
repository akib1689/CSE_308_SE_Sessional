package com.company.roles;

import com.company.accounts.Account;

import java.util.List;

public class Officer extends Cashier{

    public void approveLoan(List<Account> accounts){
        double total = 0;
        for (Account account: accounts){
            if (account.approveLoan()){
                System.out.println("Loan approved! Account holder's name: " + account.getOwner());

            }
        }
    }
}
