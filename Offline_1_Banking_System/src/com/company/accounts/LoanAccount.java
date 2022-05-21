package com.company.accounts;

public class LoanAccount extends Account{
    private double pending;
    public LoanAccount(String owner, double amount) {
        super(owner, 0, 10, AccountType.LOAN);
        this.pending = amount;
    }

    protected double getInterest(){
        return getAmount() * getRate();
    }

    @Override
    public void addInterest() {
        setAmount(getAmount()+getAmount()*getRate());
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
        pending = amount;
        return true;
    }


    @Override
    public double approveLoan() {
        double val = pending;
        if (pending > 0) {
            setAmount(getAmount() + pending);
            pending = 0;
            return val;
        }

        return 0;
    }
}
