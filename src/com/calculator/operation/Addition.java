package com.calculator.operation;

public class Addition implements NumericOperation {
    @Override
    public double operation(double param1, double param2) {

        double result = param1 + param2;
        return result;
    }
}
