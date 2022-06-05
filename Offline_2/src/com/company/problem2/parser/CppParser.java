/*
 * Copyright (c) 2022, Akibur Rahman
 * All rights reserved
 */

package com.company.problem2.parser;

public class CppParser implements Parser {
    @Override
    public void parse(String fileName) {
        System.out.println("Parsing file: " + fileName + " in C++");
        System.out.println("The name of the fot is: Monaco");
    }
}
