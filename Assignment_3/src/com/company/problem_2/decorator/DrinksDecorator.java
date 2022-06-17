package com.company.problem_2.decorator;

import com.company.problem_2.Order;
import com.company.problem_2.drink.DrinksFactory;

/**
 * This is a decorator class that adds drinks to an order.
 */
public class DrinksDecorator {
    /**
     * Function to decorate an order with drinks.
     * @param order         The order to decorate. The order is modified in place.
     * @param drinkType The type of drink to add. The drink type is case-insensitive.
     * @return The order with the drink added.
     */
    public static Order decorate(Order order, String drinkType) {
        order.addFood(DrinksFactory.createDrink(drinkType));
        return order;
    }
}
