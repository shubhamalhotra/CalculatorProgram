package com.calculator.type;

import com.calculator.exception.InvalidOperatorException;
import com.calculator.operation.*;

import java.util.HashMap;
import java.util.Map;

public class SimpleCalculator extends Calculator {

    final double param1, param2;
    final String operator;
    final Map<String, NumericOperation> operatorOperationMap = new HashMap<>();

    public SimpleCalculator(final double param1,final double param2,final String operator)
    {
        this.param1 = param1;
        this.param2 = param2;
        this.operator = operator;

        operatorOperationMap.put("+",new Addition());
        operatorOperationMap.put("-",new Substraction());
        operatorOperationMap.put("*",new Multiplication());
        operatorOperationMap.put("/",new Division());

    }
    @Override
    public double calculate() {

        double result;

        if(!operatorOperationMap.containsKey(operator))
        {
            throw new InvalidOperatorException("Not a valid operator. " + operator);
        }

        NumericOperation numericOperation = operatorOperationMap.get(operator);

        result = numericOperation.operation(param1,param2);

        return  result;
    }
}
