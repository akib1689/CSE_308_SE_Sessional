/*
 * Copyright (c) 2022, Akibur Rahman
 * All rights reserved
 */

package com.company.problem2.factory;

import com.company.problem2.factory.ParserFactory;
import com.company.problem2.parser.Parser;
import com.company.problem2.parser.PyParser;

public class PyFactory implements ParserFactory {

    @Override
    public Parser getParser() {
        return new PyParser();
    }

}
