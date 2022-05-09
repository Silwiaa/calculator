package com.project.parasoft;

import com.project.parasoft.calculator.exception.DivideByZeroException;
import com.project.parasoft.calculator.service.Calculator;
import com.project.parasoft.calculator.service.CalculatorService;
import com.project.parasoft.calculator.service.Operation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParasoftApplication {

    public static void main(String[] args) throws DivideByZeroException {
        //SpringApplication.run(ParasoftApplication.class, args);
        Calculator calculator = new CalculatorService();
        System.out.println(calculator.count(2, 6, Operation.ADD));
    }
}
