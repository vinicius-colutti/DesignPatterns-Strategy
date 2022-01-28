package com.colutti.designpatterns.strategy.controller;

import com.colutti.designpatterns.strategy.service.Calculator;
import com.colutti.designpatterns.strategy.service.impl.ICMS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigDecimal;

@RestController
@RequestMapping("/budget")
public class BudgetController {

    private final Calculator calculator;

    @Autowired
    public BudgetController(Calculator Calculator) {
        this.calculator = Calculator;
    }

    @GetMapping("/{value}")
    public BigDecimal taxCalculate(@PathVariable("value") BigDecimal value){
        return calculator.calculateTax(value, new ICMS());
    }

}
