package com.company.problem_2.decorator;

import com.company.problem_2.burger.Burger;
import com.company.problem_2.toppings.Cheese;

/**
 * This is a decorator class that adds cheese to a burger.
 */
public class CheeseDecorator {
    /**
     * Function to decorate a burger with cheese.
     */
    public static Burger decorate(Burger burger) {
        burger.addTopping(new Cheese());
        return burger;
    }
}
