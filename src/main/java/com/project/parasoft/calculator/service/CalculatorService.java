package com.project.parasoft.calculator.service;

import com.project.parasoft.calculator.exception.DivideByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements Calculator {

    @Override
    public double count(double x, double y, Operation operation) throws DivideByZeroException {
        double result = 0;
        switch (operation) {
            case ADD:
                result = sum(x, y);
                break;
            case SUB:
                result = sub(x, y);
                break;
            case MULTIPLY:
                result = multipy(x, y);
                break;
            case DIVIDE:
                result = divide(x, y);
                break;
        }
       return result;
    }

    public double sum(double x, double y) {
        return x + y;
    }

    public double sub(double x, double y) {
        return x - y;
    }

    public double multipy(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) throws DivideByZeroException {
        if(validateDivider(y)) {
            return x / y;

        } else return 0;

    }

    private boolean validateDivider(double y) throws DivideByZeroException {
        if (y != 0) {
            return true;
        }

        throw new DivideByZeroException();
    }
}
