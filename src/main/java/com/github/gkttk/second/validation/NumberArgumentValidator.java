package com.github.gkttk.second.validation;

public class NumberArgumentValidator implements ArgumentValidator {


    @Override
    public boolean validateArgument(String argument) {
            try{
                Integer.parseInt(argument);
            }catch (NumberFormatException e){
                return false;
            }
        return true;

    }
}
