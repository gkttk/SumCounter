package com.github.gkttk.second.view;

public class ConsoleResultPrinter implements ResultPrinter<Long> {

    @Override
    public void print(Long argumentsSum) {
        System.out.println("Sum of numeric arguments is " + argumentsSum.toString());
    }
}
