package com.github.gkttk.second;

import com.github.gkttk.second.logic.ArgumentsHandler;
import com.github.gkttk.second.logic.factory.ArgumentsHandlerFactory;
import com.github.gkttk.second.logic.factory.SumCountArgumentsHandlerFactory;
import com.github.gkttk.second.view.ResultPrinter;
import com.github.gkttk.second.view.factory.ConsoleResultPrinterFactory;
import com.github.gkttk.second.view.factory.ResultPrinterFactory;

public class Main {
    public static void main(String[] args) {
        /*Program gets data from command-line arguments and summarizes only integer arguments from args.
        Non-integer arguments are ignored.
        */

        //logic
        ArgumentsHandlerFactory argumentsHandlerFactory = new SumCountArgumentsHandlerFactory();
        ArgumentsHandler argumentHandler = argumentsHandlerFactory.createArgumentHandler();
        long argumentsSum = argumentHandler.processArguments(args);

        //print result
        ResultPrinterFactory resultPrinterFactory = new ConsoleResultPrinterFactory();
        ResultPrinter resultPrinter = resultPrinterFactory.createPrinter();
        resultPrinter.print(argumentsSum);


    }
}
