package com.assignment.gradle.factorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {
    private final int flagForNegativeNum=-1;
    @Test
    void shouldReturnSixForFactorialOfThree() {
        FactorialCalculator factorialCalculator = new FactorialCalculator(3);
        int factorialOfThree = factorialCalculator.calculateFactorial();
        Assertions.assertEquals(6,factorialOfThree);
    }

    @Test
    void shouldReturnOneForFactorialOfZero() {
        FactorialCalculator factorialCalculator = new FactorialCalculator(0);
        int factorialOfZero = factorialCalculator.calculateFactorial();
        Assertions.assertEquals(1,factorialOfZero);
    }

    @Test
    void shouldMatchFlagForNegativeNumForFactorialOfMinusTwo() {
        FactorialCalculator factorialCalculator = new FactorialCalculator(-2);
        int factorialOfMinusTwo = factorialCalculator.calculateFactorial();
        Assertions.assertEquals(flagForNegativeNum,factorialOfMinusTwo);
    }

    @Test
    void shouldMatchFlagForNegativeNumForFactorialOfMinusFive() {
        FactorialCalculator factorialCalculator = new FactorialCalculator(-5);
        int factorialOfMinusFive = factorialCalculator.calculateFactorial();
        Assertions.assertEquals(flagForNegativeNum,factorialOfMinusFive);
    }
    @Test
    void shouldReturnFiveThousandAndFortyForFactorialOfSeven(){
        FactorialCalculator factorialCalculator = new FactorialCalculator(7);
        int factorialOfSeven = factorialCalculator.calculateFactorial();
        Assertions.assertEquals(5040,factorialOfSeven);
    }
}