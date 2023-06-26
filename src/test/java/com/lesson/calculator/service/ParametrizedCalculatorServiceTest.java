package com.lesson.calculator.service;

import com.lesson.calculator.service.impl.CalcServiceImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametrizedCalculatorServiceTest {
    CalcService calc = new CalcServiceImpl();

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, 2),
                Arguments.of(22, -4),
                Arguments.of(43, 12),
                Arguments.of(53, 5),
                Arguments.of(123, 56)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void plus(int num1, int num2){
        int excepted = num1+num2;
        int actual = calc.plus(num1, num2);
        assertEquals(excepted, actual);
    }
    @ParameterizedTest
    @MethodSource("data")
    void minus(int num1, int num2){
        int excepted = num1-num2;
        int actual = calc.minus(num1, num2);
        assertEquals(excepted, actual);
    }
    @ParameterizedTest
    @MethodSource("data")
    void multiply(int num1, int num2){
        int excepted = num1*num2;
        int actual = calc.multiply(num1, num2);
        assertEquals(excepted, actual);
    }
    @ParameterizedTest
    @MethodSource("data")
    void divide(double num1, double num2){
        double excepted = num1/num2;
        double actual = calc.divide(num1, num2);
        assertEquals(excepted, actual);
    }
}
