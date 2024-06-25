package com.qa;
import org.junit.jupiter.api.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void addNumbers() {
        int a = 5;
        int y = 9;
        int ex = a+y;
    assertEquals(ex,calculator.addNumbers( a, y));
    }
    @Test
    public void subNumbers() {
        int a = 5;
        int y = 9;
        int ex = a-y;
        assertEquals(ex, calculator.subNumbers(a, y));
    }
    @Test
    public void divNumbers() {
        int a = 5;
        int y = 9;
        int ex = a/y;
        assertEquals(ex, calculator.divNumbers(a, y));
    }
    @Test
    public void multNumbers() {
        int a = 5;
        int y = 9;
        int ex = a*y;
        assertEquals(ex, calculator.multNumbers(a, y));
    }


}
