package com.company.problem_2.toppings;

public class Cheese extends Toppings {
    public Cheese() {
        super("Cheese", 0.10);
    }

    @Override
    public void print() {
        System.out.println("\t\tCheese: "+price);
    }
}
