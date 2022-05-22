package com.company.accounts;


public class DepositAccount extends Account {
    private LoanAccount loan;
    private int ageOfAccount;

    public DepositAccount(String owner, double amount) {
        super(owner, amount, 15, AccountType.DEPOSIT);
        this.ageOfAccount = 0;
    }

    private void incrementAge() {
        ageOfAccount++;
    }

    @Override
    public void addInterest() {
        if (loan == null) {
            setAmount(getAmount() + getAmount() * getRate() - 500);
            return;
        }
        setAmount(getAmount() + getAmount() * getRate() - loan.getInterest() - 500);
        incrementAge();
    }

    @Override
    public boolean deposit(double amount) {
        if (amount < 50000) {
            return false;
        }
        // check if there is loan against the person
        if (loan == null) {
            setAmount(getAmount() + amount);
        } else {
            double loanAmount = loan.getAmount();
            if (amount > loanAmount) {
                loan.deposit(loanAmount);
                setAmount(amount - loanAmount);
            } else {
                loan.deposit(amount);
            }
        }
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if (ageOfAccount < 1 || amount < 0 || getAmount() - amount < 0) {
            return false;
        }
        setAmount(getAmount() - amount);
        return false;
    }

    @Override
    public boolean requestLoan(double amount) {
        if (amount < 0 || amount > 100000) {
            return false;
        }
        if (loan == null) {
            loan = new LoanAccount(getOwner(), amount);
        } else {
            return loan.requestLoan(amount);
        }
        return true;
    }

    @Override
    public double approveLoan() {
        if (this.loan == null) {
            return 0;
        }
        double val = loan.approveLoan();
        setAmount(getAmount() + val);
        return val;
    }

}
