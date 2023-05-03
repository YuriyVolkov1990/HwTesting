package com.lesson.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    @GetMapping("/")
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping(path = "/plus")
    public String plus(@RequestParam int num1, int num2) {
        int num3=num1+num2;
        return num1 + "+" + num2 + "=" + num3;
    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam int num1, int num2) {
        int num3=num1-num2;
        return num1 + "-" + num2 + "=" + num3;
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam int num1, int num2) {
        int num3=num1*num2;
        return num1 + "*" + num2 + "=" + num3;
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam double num1, double num2) {
        double num3=num1/num2;
        if (num2 == 0) {
            return  "Делить на ноль нельзя!";
        } else return num1 + "/" + num2 + "=" + num3;
    }
}
