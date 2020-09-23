package com.github.gkttk.second.view;

/**
 * This class is responsible for console output
 */

public class ConsoleResultPrinter implements ResultPrinter {

    @Override
    public void print(long argumentsSum) {
        System.out.println("Sum of numeric arguments is " + argumentsSum);
    }
}
