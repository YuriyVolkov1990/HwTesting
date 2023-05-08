package com.lesson.calculator;

import org.springframework.stereotype.Service;
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
        return a/b;
    }
}
