package com.company.problem_2.drink;

/**
 * This is a factory class that creates drinks.
 */
public class DrinksFactory {
    /**
     * Function to create a drink.
     */
    public static Drink createDrink(String drinkType) {
        switch (drinkType.toLowerCase()) {
            case "water":
                return new Water();
            case "coffee":
                return new Coffee();
            case "coke":
                return new Coke();
            default:
                throw new IllegalArgumentException("Invalid drink type");
        }
    }
}
