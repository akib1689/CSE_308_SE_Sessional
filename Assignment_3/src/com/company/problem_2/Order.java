package com.company.problem_2;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Food> foodList;

    public Order() {
        this.foodList = new ArrayList<>();
    }

    public void addFood(Food food) {
        foodList.add(food);
    }



    public void print() {
        for (Food food : foodList) {
            food.print();
        }
    }

}
