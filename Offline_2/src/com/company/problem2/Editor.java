/*
 * Copyright (c) 2022, Akibur Rahman
 * All rights reserved
 */

package com.company.problem2;
/*
* Singleton class editor
* It has an instance of parser */

import com.company.problem2.factory.FactoryConfig;
import com.company.problem2.factory.ParserFactory;
import com.company.problem2.parser.Parser;

public class Editor {
    private static  final Editor instance = new Editor();


    private Editor() {

    }

    public void parserFile(String fileName) {
        ParserFactory factory;
        if (fileName.endsWith(".cpp")){
            factory = FactoryConfig.getParserFactory("cpp");
        }else if (fileName.endsWith(".c")) {
            factory = FactoryConfig.getParserFactory("c");
        }else if (fileName.endsWith(".py")) {
            factory = FactoryConfig.getParserFactory("python");
        }else {
            throw new IllegalArgumentException("Invalid file name");
        }
        Parser parser = factory.getParser();
        parser.parse(fileName);
    }

    public static Editor getInstance() {
        return instance;
    }
}
