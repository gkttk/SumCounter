package com.github.gkttk.second;

import com.github.gkttk.second.logic.ArgumentsHandler;
import com.github.gkttk.second.logic.SumCountArgumentsHandler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SumCountArgumentHandlerTest {

    private static ArgumentsHandler sumCountArgumentHandler;

    @BeforeAll
    static void init() {
        sumCountArgumentHandler = new SumCountArgumentsHandler();
    }

    @Test
    public void testProcessArgumentsWhenAllArgumentsAreNotNumbers() {
        String[] arguments = {"one", "two", "three"};
        long expectedValue = 0;
        long resultArgumentsSum = sumCountArgumentHandler.processArguments(arguments);
        Assertions.assertEquals(expectedValue, resultArgumentsSum);
    }

    @Test
    public void testProcessArgumentsWhenAllArgumentsAreNumbers() {
        String[] arguments = {"1", "2", "3"};
        long expectedValue = 6;
        long resultArgumentsSum = sumCountArgumentHandler.processArguments(arguments);
        Assertions.assertEquals(expectedValue, resultArgumentsSum);
    }

    @Test
    public void testProcessArgumentsWhenAllArgumentsAreMixed() {
        String[] arguments = {"1", "two", "three", "4"};
        long expectedValue = 5;
        long resultArgumentsSum = sumCountArgumentHandler.processArguments(arguments);
        Assertions.assertEquals(expectedValue, resultArgumentsSum);
    }


}
