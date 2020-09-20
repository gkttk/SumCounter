package com.github.gkttk.second;

import com.github.gkttk.second.validation.ArgumentValidator;
import com.github.gkttk.second.validation.NumberArgumentValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NumberArgumentValidatorTest {

    private static ArgumentValidator numberArgumentValidator;

    @BeforeAll
    static void init(){
        numberArgumentValidator = new NumberArgumentValidator();
    }

    @Test
    public void testValidateArgumentWhenArgumentIsNotANumber(){
        String argument = "one";
        boolean resultValidateArgument = numberArgumentValidator.validateArgument(argument);
        Assertions.assertFalse(resultValidateArgument);
    }

    @Test
    public void testValidateArgumentWhenArgumentIsANumber(){
        String argument = "1";
        boolean resultValidateArgument = numberArgumentValidator.validateArgument(argument);
        Assertions.assertTrue(resultValidateArgument);
    }




}
