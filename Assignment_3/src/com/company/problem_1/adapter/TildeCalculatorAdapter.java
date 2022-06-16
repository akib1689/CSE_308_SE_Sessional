package com.company.problem_1.adapter;
/*
 * TildeCalculatorAdapter.java
 * this is adapter class in the problem that is to calculate the sum of the numbers
 * this class receives a file in which the file is formatted as follows:
 * decimals point numbers seperated by tilde character(~)
 * the file can have multiple lines
 * uses the CalculateSum.java class to calculate the sum of the numbers
 */
import com.company.problem_1.sum_calculator.CalculateSum;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TildeCalculatorAdapter implements SumCalculatorAdapter {
    //service class in the problem that is to calculate the sum of the numbers
    private final CalculateSum calculateSum;

    public TildeCalculatorAdapter() {
        calculateSum = new CalculateSum();
    }

    /*
     * This function calculates the sum of the numbers in a file
     * The file should be in the following format:
     * decimals point numbers seperated by tilde character(~)
     * the file can have multiple lines
     * terminates with .txt extension
     * @param fileName      the name of the file
     * @return              the sum of the numbers in the file in decimal format
     */
    @Override
    public double calculateSum(String fileName) {
        // open the file from the fileName using Buffered reader
        // and stores the file input in the variable line then in an array list
        List<String> lines = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // read the first line
            String line;
            // while there is a line to read
            while((line = br.readLine()) != null) {
                // stores the line in arraylist
                lines.add(line);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        //convert the filename
        String convertedFileName = fileName.replace(".txt", "_converted.txt");
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(convertedFileName))) {
            // for each line in the arraylist
            // separate the line by the tilde character(~)
            // replace the ~ with <space> character
            for (String line : lines) {
                String convertedLine = line.replace('~', ' ');
                convertedLine += " ";
                // write the line to the file
                writer.write(convertedLine);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        // call the method from the service class to calculate the sum of the numbers
        return calculateSum.calculateSum(convertedFileName);
    }
}
