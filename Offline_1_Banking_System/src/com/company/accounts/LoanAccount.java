package com.company.accounts;

public class LoanAccount extends Account{
    private boolean approved;
    public LoanAccount(String owner, double amount) {
        super(owner, amount, 10, AccountType.LOAN);
        this.approved = false;
    }

    public void setApproved(boolean approved){
        this.approved = approved;
    }

    @Override
    public boolean deposit(double amount) {
        if (amount < 0){
            return false;
        }

        if (getAmount() < amount) {
            // there is no type of account conversion so
            // if the user deposits more than the loan amount the amount is simply lost during the process
            setAmount(0);
            return true;
        }
        setAmount(getAmount() - amount);
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        // the loan account can't withdraw any amount from the
        return false;
    }

    @Override
    public boolean requestLoan(double amount) {
        if (amount > getAmount() * 1.05){
            return false;
        }
        setAmount(getAmount() + amount);
        approved = false;
        return true;
    }


    @Override
    public boolean approveLoan() {
        this.approved = true;
        return true;
    }

    @Override
    public double netAmount() {
        return -getAmount();
    }
}
