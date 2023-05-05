package com.lesson.calculator;

import org.springframework.stereotype.Service;
@Service
public class CalcServiceImpl implements CalcService {
    @Override
    public int plus(int a, int b) {
        return a+b;
    }
}
