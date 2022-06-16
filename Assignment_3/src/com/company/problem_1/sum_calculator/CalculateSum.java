package com.company.problem_1.sum_calculator;
/*
    * CalculateSum.java
    * this is service class in the problem that is to calculate the sum of the numbers
    * as we are going to implement the adapter design pattern
    * there should be a class that has the implementation of the service class
    * this class might be in the different package as the adapter class
 */

import java.io.BufferedReader;
import java.io.FileReader;

public class CalculateSum {
     /*
     * The function below calculates the sum of the numbers in a file
     * The file should be in the following format:
     * decimals point numbers seperated by <space> character
     * the file can have multiple lines
     * @param fileName      the name of the file
     * @return              the sum of the numbers in the file in decimal format
     */
    public double calculateSum(String fileName) {
        // write your code here
        //open the file from the fileName using Buffered reader
        double sum = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            //read the first line
            String line;

            //while there is a line to read
            while((line = br.readLine()) != null) {
                //split the line by the space character
                String[] numbers = line.split(" ");
                //for each number in the line
                for(String number : numbers) {
                    //convert the number to double
                    double num = Double.parseDouble(number);
                    //add the number to the sum
                    sum += num;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return sum;
    }
}
