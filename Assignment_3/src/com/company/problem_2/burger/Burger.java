package com.company.problem_2.burger;

import com.company.problem_2.Food;
import com.company.problem_2.toppings.Toppings;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a burger.
 * There are different types of burgers are being sold. like veggie burger, chicken burger, beef burger, etc.
 * There are provisions to add cheese on those burgers.
 */
public abstract class Burger extends Food {
    protected List<Toppings> toppings;

    /**
     * Constructor to initialize the burger.
     * @param name Name of the burger.
     * @param price Price of the burger.
     */
    public Burger(String name, double price) {
        super(name, price);
        toppings = new ArrayList<>();
    }

    /**
     * Function to add toppings to the burger.
     * @param topping Topping to be added to the burger.
     */
    public void addTopping(Toppings topping) {
        toppings.add(topping);
        price += topping.getPrice();
    }

    @Override
    public void print() {
        System.out.println("Burger: " + name + ": " + price + "$");
        for (Toppings topping : toppings) {
            topping.print();
        }
    }
}
