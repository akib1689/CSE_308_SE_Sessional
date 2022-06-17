package com.company.problem_2;

public abstract class Food {
    protected String name;
    protected double price;

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void  print();
}
