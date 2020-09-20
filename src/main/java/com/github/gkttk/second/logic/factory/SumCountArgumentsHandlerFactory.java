package com.github.gkttk.second.logic.factory;

import com.github.gkttk.second.logic.ArgumentsHandler;
import com.github.gkttk.second.logic.SumCountArgumentsHandler;

public class SumCountArgumentsHandlerFactory implements ArgumentsHandlerFactory {

    @Override
    public ArgumentsHandler createArgumentHandler() {
        return new SumCountArgumentsHandler();
    }
}
