package com.company.problem_2.drink;

import com.company.problem_2.Food;

public abstract class Drink extends Food {
    public Drink(String name, double price) {
        super(name, price);
    }

    public void print() {
        System.out.println("Drink: " + name + "\t\t\t\t\t" + price + " $");
    }
}
