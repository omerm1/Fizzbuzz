package com.sparta.om;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTests {
    // Red - write a failing tes
    // Green - write enough to pass the test
    // refactor without failing previous tests
    @Test
    @DisplayName("given values is 3, then return Buzz")
    void givenValuesIs3ThenReturnBuzz() {
        Assertions.assertEquals("Buzz", FizzBuzz.getValue(3));
    }

    @Test
    @DisplayName("given value is 5, return Fizz")
    void givenValueIs5ThenReturnFizz() {
        Assertions.assertEquals("Fizz", FizzBuzz.getValue(5));
    }

    @Test
    @DisplayName("given value is divisible by 3, return Buzz")
    void givenValueIsDivisibleBy3ReturnBuzz() {
        Assertions.assertEquals("Buzz", FizzBuzz.getValue(9));
    }

    @Test
    @DisplayName("given value is divisible by 5, return Fizz")
    void givenValueIsDivisibleBy5ReturnFizz() {
        Assertions.assertEquals("Fizz", FizzBuzz.getValue(10));
    }

    @Test
    @DisplayName("given value is divisible by 3 and 5, return FizzBuzz")
    void givenValueIsDivisibleBy3and5ReturnFizzBuzz() {
        Assertions.assertEquals("FizzBuzz", FizzBuzz.getValue(15));
    }


}

