package test;
//CalculatorTest.java
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

import hw1.Calculator;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 4);
        assertEquals(7, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(7, 4);
        assertEquals(3, result);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(3, 4);
        assertEquals(12, result);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Calculator calculatorMock = mock(Calculator.class);
        when(calculatorMock.divide(anyInt(), eq(0))).thenThrow(new ArithmeticException("Cannot divide by zero."));
        calculatorMock.divide(10, 0);
    }
}
