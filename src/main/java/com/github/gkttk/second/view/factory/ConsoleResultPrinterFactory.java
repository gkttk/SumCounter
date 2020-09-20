package com.github.gkttk.second.view.factory;

import com.github.gkttk.second.view.ConsoleResultPrinter;
import com.github.gkttk.second.view.ResultPrinter;

public class ConsoleResultPrinterFactory implements ResultPrinterFactory {

    @Override
    public ResultPrinter createPrinter() {
        return new ConsoleResultPrinter();
    }
}
