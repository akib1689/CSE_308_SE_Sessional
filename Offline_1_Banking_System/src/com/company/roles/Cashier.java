package com.company.roles;

import com.company.accounts.Account;

public class Cashier extends BaseUser {

    public void seeCustomer(Customer customer){
        System.out.print(customer.getName() + "'s ");
        customer.checkBalance();
    }
}
