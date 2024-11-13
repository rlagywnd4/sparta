package org.example.week04;

import org.example.week03.AbstractOperation;

public class AddOperation extends AbstractOperation {
    @Override
    double operate (int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
