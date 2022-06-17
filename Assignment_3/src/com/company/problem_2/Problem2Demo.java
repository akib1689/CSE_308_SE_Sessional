package com.company.problem_2;

import com.company.problem_2.burger.Burger;
import com.company.problem_2.burger.BurgerFactory;
import com.company.problem_2.decorator.AppetizerDecorator;
import com.company.problem_2.decorator.CheeseDecorator;

public class Problem2Demo {
    public static void main(String[] args) {
        //beef burger with cheese and french fries
        Order order = new Order();
        Burger burger = BurgerFactory.createBurger("beef");
        CheeseDecorator.decorate(burger);
        order.addFood(burger);
        AppetizerDecorator.decorate(order, "fries");
        order.print();

        //
    }
}
