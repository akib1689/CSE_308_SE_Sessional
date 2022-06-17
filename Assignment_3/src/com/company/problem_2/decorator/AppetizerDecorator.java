package com.company.problem_2.decorator;

import com.company.problem_2.Order;
import com.company.problem_2.appetizer.AppetizerFactory;

/**
 * This is a decorator class that adds appetizer to the order.
 */
public class AppetizerDecorator {
    /**
     * Function to decorate an order with appetizer.
     * @param order         The order to decorate. The order is modified in place.
     * @param appetizerType The type of appetizer to add. The appetizer type is case-insensitive but written in snake case.
     * @return The order with the appetizer added.
     */
    public static Order decorate(Order order, String appetizerType) {
        order.addFood(AppetizerFactory.createAppetizer(appetizerType));
        return order;
    }
}
