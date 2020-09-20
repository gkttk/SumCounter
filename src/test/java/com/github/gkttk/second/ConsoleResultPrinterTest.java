package com.github.gkttk.second;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConsoleResultPrinterTest {

    private static ByteArrayOutputStream newOut;
    private static PrintStream defaultOut;

    @BeforeAll
    static void init() {
        defaultOut = System.out;
        newOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newOut));
    }

    @Test
    public void testPrint() {
        String testString = "test string";
        System.out.print(testString);
        Assertions.assertEquals(testString, newOut.toString());
    }


    @AfterAll
    static void destroy() {
        System.setOut(defaultOut);
    }

}
