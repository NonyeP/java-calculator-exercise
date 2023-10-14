package com.codingblackfemales;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName(value = "The Calculator should")
public class CalculatorTests {
    @Test
    @DisplayName("add two numbers")
    public void testAddition() {
        final Integer sum = Calculator.add(2, 4);
        assertEquals(6, sum);
    }
    @Test
    @DisplayName("add one positive and one negative numbers")
    public void testOneNegativeAndPositiveAddition() {
        final Integer sum = Calculator.add(-2, 4);
        assertEquals(2, sum);
    }
    @Test
    @DisplayName("add one positive and zero")
    public void testOnePositiveAndZeroAddition() {
        final Integer sum = Calculator.add(2, 0);
        assertEquals(2, sum);
    }
    @Test
    @DisplayName("subtract two numbers")
    public void testSubtraction() {
        final Integer difference = Calculator.subtract(2, 4);
        assertEquals(-2, difference);
    }
    @Test
    @DisplayName("Multiply two negative numbers")
    public void testNegaiveNumbersMultiplication(){
        final Integer product = Calculator.multiply(-2, -4);
        assertEquals(8, product);
    }
    @Test
    @DisplayName("Multiply two positive numbers")
    public void testPositiveNumbersMultiplication(){
        final Integer product = Calculator.multiply(2, 4);
        assertEquals(8, product);
    }
    @Test
    @DisplayName("Multiply one postive and one negative number")
    public void testPositiveAndNegativeNumbersMultiplication(){
        final Integer product = Calculator.multiply(-2, 4);
        assertEquals(-8, product);
    }
    @Test
    @DisplayName("Multiply by zero")
    public void testZeroMultiplication(){
        final Integer product = Calculator.multiply(0, 4);
        assertEquals(0, product);
    }
    @Test
    @DisplayName("Multiply by one")
    public void testOneMultiplication(){
        final Integer product = Calculator.multiply(1, 4);
        assertEquals(4, product);
    }
     @Test
    @DisplayName("Divide two negative numbers")
    public void testNegaiveNumbersDivision(){
        final Integer division = Calculator.divide(-2, -4);
        assertEquals(0, division);
    }
    @Test
    @DisplayName("Divide two positive numbers")
    public void testPositiveNumbersDivision(){
        final Integer division = Calculator.divide(2, 4);
        assertEquals(0, division);
    }
    @Test
    @DisplayName("Divide one postive and one negative number")
    public void testPositiveAndNegativeNumbersDivision(){
        final Integer division = Calculator.divide(-2, 4);
        assertEquals(0, division);
    }
    @Test
    @DisplayName("Divide by zero")
    public void testZeroDivision(){
        assertThrows(ArithmeticException.class, ()-> {
            Calculator.divide(4,0);
        });
    }
    @Test
    @DisplayName("Divide by one")
    public void testOneDivision(){
        final Integer division = Calculator.divide(4, 1);
        assertEquals(4, division);
    }
}
