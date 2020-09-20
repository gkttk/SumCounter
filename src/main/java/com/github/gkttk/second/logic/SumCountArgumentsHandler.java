package com.github.gkttk.second.logic;

import com.github.gkttk.second.validation.ArgumentValidator;
import com.github.gkttk.second.validation.NumberArgumentValidator;


public class SumCountArgumentsHandler implements ArgumentsHandler {

    private ArgumentValidator argumentValidator;

    public SumCountArgumentsHandler() {
        this.argumentValidator = new NumberArgumentValidator();
    }

    @Override
    public long processArguments(String[] arguments) {

        long sum = 0;
        for (String argument: arguments){
            if(argumentValidator.validateArgument(argument)){
                sum += Integer.parseInt(argument);
            }
        }

        return sum;
    }
}
