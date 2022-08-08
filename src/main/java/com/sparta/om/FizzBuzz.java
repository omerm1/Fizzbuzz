package com.sparta.om;

public class FizzBuzz {
    public static String getValue(int number) {
        String answer = "";
        if (number == 3) {
            answer = "Buzz";
        } else if (number == 5) {
            answer = "Fizz";
        } else if (number % 5 == 0 && number % 3 == 0) {
            answer = "FizzBuzz";
        } else if (number % 5 == 0) {
            answer = "Fizz";
        } else if (number % 3 == 0) {
            answer = "Buzz";
        }
        return answer;
    }
}
