package com.lesson.calculator.service;

import com.lesson.calculator.service.impl.CalcServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcServTest {
     CalcService calcService = new CalcServiceImpl();

     @Test
    void sumPositive(){
         assertEquals(10, calcService.plus(2, 8));
     }
    @Test
    void sumNegative(){
        assertEquals(-10, calcService.plus(-2, -8));
    }

    @Test
    void sumSymmetry() {
         assertEquals(calcService.plus(4,8),calcService.plus(8,4));
     }
}
