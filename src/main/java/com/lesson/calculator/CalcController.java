package com.lesson.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    public final CalcService calculator = new CalcServiceImpl();
    @GetMapping("/")
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping(path = "/plus")
    public String plus(@RequestParam(name = "num1") int a,@RequestParam(name = "num2") int b) {
        return a + "+" + b + "=" + calculator.plus(a,b);
    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam(name = "num1") int a,@RequestParam(name = "num2") int b) {
        return a + "-" + b + "=" + calculator.minus(a,b);
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(name = "num1") int a,@RequestParam(name = "num2") int b) {
        return a + "*" + b + "=" + calculator.multiply(a,b);
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam(name = "num1") double a,@RequestParam(name = "num2") double b) {
        if (b == 0) {
            return  "Делить на ноль нельзя!";
        } else return a + "/" + b + "=" + calculator.divide(a,b);
    }
}
