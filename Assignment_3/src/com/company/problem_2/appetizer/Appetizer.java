package com.company.problem_2.appetizer;

import com.company.problem_2.Food;

public abstract class Appetizer extends Food {
    public Appetizer(String name, double price) {
        super(name, price);
    }

    @Override
    public void print(){
        System.out.println("Appetizer: " + name + "\t\t\t\t" + price + "$");
    }
}
