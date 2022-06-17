package com.company.problem_2.burger;

/**
 * This is a factory class that creates burger objects.
 */
public class BurgerFactory {
    /**
     * Creates a burger object.
     *
     * @param type the type of burger to create
     * @return the burger object
     */
    public static Burger createBurger(String type) {
        switch (type.toLowerCase()) {
            case "beef":
                return new BeefBurger();
            case "veggie":
                return new VeggieBurger();
            case "chicken":
                return new ChickenBurger();
            default:
                throw new IllegalArgumentException("Invalid burger type");
        }
    }
}
