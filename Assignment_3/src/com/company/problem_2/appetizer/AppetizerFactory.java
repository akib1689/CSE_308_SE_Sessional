package com.company.problem_2.appetizer;

/**
 * This is a factory class that creates appetizers.
 */
public class AppetizerFactory {
    /**
     * Creates an appetizer object.
     *
     * @param type the type of appetizer to create
     * @return the appetizer object
     */
    public static Appetizer createAppetizer(String type) {
        switch (type.toLowerCase()) {
            case "onion_rings":
                return new OnionRings();
            case "fries":
                return new FrenchFries();
            default:
                throw new IllegalArgumentException("Invalid appetizer type");
        }
    }
}
