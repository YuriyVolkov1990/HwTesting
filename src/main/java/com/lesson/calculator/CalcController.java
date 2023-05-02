package com.lesson.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    @GetMapping(path = "/calculator")
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam int num1, int num2) {
        int num3=num1+num2;
        return num1 + "+" + num2 + "=" + num3;
    }
    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam int num1, int num2) {
        int num3=num1-num2;
        return num1 + "-" + num2 + "=" + num3;
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam int num1, int num2) {
        int num3=num1*num2;
        return num1 + "*" + num2 + "=" + num3;
    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam double num1, double num2) {
        double num3=num1/num2;
        return num1 + "/" + num2 + "=" + num3;
    }
}
