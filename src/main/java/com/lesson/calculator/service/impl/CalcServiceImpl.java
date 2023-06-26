package com.lesson.calculator.service.impl;

import com.lesson.calculator.exceptions.DivisionByZeroException;
import com.lesson.calculator.service.CalcService;
import org.springframework.stereotype.Service;

import java.security.DigestException;

@Service
public class CalcServiceImpl implements CalcService {
    @Override
    public int plus(int a, int b) {
        return a+b;
    }
    @Override
    public int minus(int a, int b) {
        return a-b;
    }
    @Override
    public int multiply(int a, int b) {
        return a*b;
    }
    @Override
    public double divide(double a, double b) {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return a/b;
    }
}
