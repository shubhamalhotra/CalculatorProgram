package com.calculator.program;

import com.calculator.type.Calculator;
import com.calculator.type.SimpleCalculator;

public class Application {
    public static void main(String[] args)
    {
        double operand1 = 12;
        double operand2 = 45;

        String addOperator = "+";
        performAddition(operand1,operand2,addOperator);

        String substractOperator = "-";
        performSubstraction(operand1,operand2,substractOperator);

        String multiplicationOperator = "*";
        performMultiplication(operand1,operand2,multiplicationOperator);

        String divisionOperator = "/";
        performDivision(operand1,operand2,divisionOperator);

    }

    private static void performAddition(double operand1, double operand2,String operator)
    {
        Calculator calcAdd = new SimpleCalculator(operand1,operand2,operator);
        double result = calcAdd.calculate();
        System.out.println("Result of  is = " +result);
    }
    private static void performSubstraction(double operand1, double operand2,String operator)
    {
        Calculator calcSubs = new SimpleCalculator(operand1,operand2,operator);
        double result = calcSubs.calculate();
        System.out.println("Result  is = " +result);
    }
    private static void performMultiplication(double operand1, double operand2,String operator)
    {
        Calculator calcMultiplication = new SimpleCalculator(operand1,operand2,operator);
        double result = calcMultiplication.calculate();
        System.out.println("Result of  is = " +result);
    }
    private static void performDivision(double operand1, double operand2,String operator)
    {
        Calculator calcDivision = new SimpleCalculator(operand1,operand2,operator);
        double result = calcDivision.calculate();
        System.out.println("Result of  is = " +result);
    }

}
