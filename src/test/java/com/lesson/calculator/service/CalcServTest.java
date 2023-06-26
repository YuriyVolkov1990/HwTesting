package com.lesson.calculator.service;

import com.lesson.calculator.exceptions.DivisionByZeroException;
import com.lesson.calculator.service.impl.CalcServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcServTest {

     CalcService calc = new CalcServiceImpl();
     @Test
    void sumPositive(){
         assertEquals(10, calc.plus(2, 8));
     }
    @Test
    void sumNegative(){
        assertEquals(-10, calc.plus(-2, -8));
    }
    @Test
    void sumSymmetry() {
         assertEquals(calc.plus(4,8), calc.plus(8,4));
     }
    @Test
    void minusPositive(){
        assertEquals(4, calc.minus(5, 1));
    }
    @Test
    void minusNegative(){
        assertEquals(-3, calc.minus(-4, -1));
    }
    @Test
    void minusNotSymmetry() {
        assertNotEquals(calc.minus(4,8), calc.minus(8,4));
    }
    @Test
    void multiplyPositive(){
        assertEquals(4, calc.multiply(2, 2));
    }
    @Test
    void multiplyNegative(){
        assertEquals(-10, calc.multiply(-5, 2));
    }
    @Test
    void multiplySymmetry() {
        assertEquals(calc.multiply(4,8), calc.multiply(8,4));
    }
    @Test
    void dividePositive() throws Exception{
        assertEquals(1, calc.divide(2, 2));
    }
    @Test
    void divideNegative() throws Exception {
        assertEquals(-2, calc.divide(-4, 2));
    }
    @Test
    void divisionByZero() {
        assertThrows(DivisionByZeroException.class, () -> {
            calc.divide(1, 0);
        });
    }
}
