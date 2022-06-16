package com.company.problem_1;

import com.company.problem_1.adapter.SumCalculatorAdapter;
import com.company.problem_1.adapter.TildeCalculatorAdapter;

public class Problem1Demo {

    public static void main(String[] args) {
        // create a file
        //demo of the client code of the adapter design pattern
        SumCalculatorAdapter adapter = new TildeCalculatorAdapter();
        double sum = adapter.calculateSum("input.txt");
        System.out.println("The sum of the numbers in the file is: " + sum);
    }
}
