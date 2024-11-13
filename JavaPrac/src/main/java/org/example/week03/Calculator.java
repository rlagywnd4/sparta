package org.example.week03;

public class Calculator {
    AbstractOperation operation;

    Calculator (AbstractOperation operation){
        this.operation = operation;
    }

    double calculate(int firstNumber, int secondNumber){
        return operation.operate(firstNumber, secondNumber);
    }
}
