package com.github.gkttk.second.validation;

/**
 * This class is responsible for checking an argument and determining whether an argument is a number
 */

public class NumberArgumentValidator implements ArgumentValidator {


    @Override
    public boolean validateArgument(String argument) {
        try {
            Integer.parseInt(argument);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
