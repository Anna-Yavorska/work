package org.example.hw_17.task_2;

import java.util.function.BinaryOperator;

public class Multiplier {
    public static void main(String[] args) {
        BinaryOperator<Integer> expression = (firstNumber, secondNumber) -> firstNumber * secondNumber;
        Integer result = expression.apply(2, 8);
        System.out.println(result);
    }
}
