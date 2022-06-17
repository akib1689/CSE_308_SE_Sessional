package com.company.problem_2;

import com.company.problem_2.burger.Burger;
import com.company.problem_2.burger.BurgerFactory;
import com.company.problem_2.decorator.AppetizerDecorator;
import com.company.problem_2.decorator.CheeseDecorator;
import com.company.problem_2.decorator.DrinksDecorator;

public class Problem2Demo {
    public static void main(String[] args) {
        //beef burger with cheese and french fries
        Order order = new Order();
        Burger burger = BurgerFactory.createBurger("beef");
        CheeseDecorator.decorate(burger);
        order.addFood(burger);
        AppetizerDecorator.decorate(order, "fries");
        order.print();
        System.out.println("Total price: " + order.getTotalPrice());
        System.out.println("-----------------------------------");

        //veggie burger with onion rings and bottle of water
        Order order1 = new Order();
        Burger burger1 = BurgerFactory.createBurger("veggie");
        order1.addFood(burger1);
        AppetizerDecorator.decorate(order1, "onion_rings");
        DrinksDecorator.decorate(order1, "water");
        order1.print();
        System.out.println("Total price: " + order1.getTotalPrice());
        System.out.println("-----------------------------------");

        //veggie burger with french fries, coke
        Order comboMeal1 = new Order();
        Burger burger2 = BurgerFactory.createBurger("veggie");
        comboMeal1.addFood(burger2);
        AppetizerDecorator.decorate(comboMeal1, "fries");
        DrinksDecorator.decorate(comboMeal1, "coke");
        comboMeal1.print();
        System.out.println("Total price: " + comboMeal1.getTotalPrice());
        System.out.println("-----------------------------------");

        //combo meal with veggie burger, french fries, coffee, water
        Order comboMeal2 = new Order();
        Burger burger3 = BurgerFactory.createBurger("veggie");
        comboMeal2.addFood(burger3);
        AppetizerDecorator.decorate(comboMeal2, "onion_rings");
        DrinksDecorator.decorate(comboMeal2, "water");
        DrinksDecorator.decorate(comboMeal2, "coffee");
        comboMeal2.print();
        System.out.println("Total price: " + comboMeal2.getTotalPrice());
        System.out.println("-----------------------------------");

        //only beef burger
        Order order2 = new Order();
        order2.addFood(BurgerFactory.createBurger("beef"));
        order2.print();


    }
}
