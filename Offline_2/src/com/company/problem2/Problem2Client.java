/*
 * Copyright (c) 2022, Akibur Rahman
 * All rights reserved
 */

package com.company.problem2;
/*
* This is the client class of the problem 2
* */

public class Problem2Client {
    public static void main(String[] args) {
        Editor.getInstance().parserFile("file.cpp");
        Editor.getInstance().parserFile("file.c");
        Editor.getInstance().parserFile("file.py");
    }
}
