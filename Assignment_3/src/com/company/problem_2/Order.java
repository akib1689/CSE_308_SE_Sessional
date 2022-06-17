package com.company.problem_2;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Food> foodList;

    public Order() {
        this.foodList = new ArrayList<>();
    }

    /**
     * function to add food to the order
     * @param food  food item that is to be added
     */
    public void addFood(Food food) {
        foodList.add(food);
    }

    /**
     * function to get the total price of the meal
     */
    public double getTotalPrice(){
        double total = 0;
        for (Food food : foodList){
            total += food.getPrice();
        }
        return total;
    }

    /**
     * function to print the order
     */
    public void print() {
        for (Food food : foodList) {
            food.print();
        }
    }

}
