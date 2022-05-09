package com.project.parasoft.calculator.service;

import com.project.parasoft.calculator.exception.DivideByZeroException;

public interface Calculator {
    double count(double x, double y, Operation operation) throws DivideByZeroException;
}
