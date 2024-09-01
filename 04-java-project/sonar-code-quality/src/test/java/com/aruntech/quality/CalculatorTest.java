package com.aruntech.quality;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void testM1() {
        calculator.m1();
        assertTrue(true);
    }

    @Test
    public void testGetData() {
        String result = (String) calculator.getData();
        assertEquals(null, result);
    }

    @Test
    public void testAdd() {
        int result = calculator.calculate(2, 4, ArithmeticOperation.ADD);
        assertEquals(6, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.calculate(5, 3, ArithmeticOperation.SUBTRACT);
        assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.calculate(2,4, ArithmeticOperation.MULTIPLY);
        assertEquals(8, result);
    }

    @Test
    public void testDivisionWithNonZero() {
        int result = calculator.calculate(10, 2, ArithmeticOperation.DIVISION);
        assertEquals(5, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testWithZero() {
        calculator.calculate(5, 0, ArithmeticOperation.DIVISION);
    }

}
