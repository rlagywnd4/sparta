package org.example.week04;

import org.example.week03.AbstractOperation;

public class Calculator {
    org.example.week03.AbstractOperation operation;

    Calculator (AbstractOperation operation){
        this.operation = operation;
    }

    double calculate(int firstNumber, int secondNumber){
        return operation.operate(firstNumber, secondNumber);
    }
}
