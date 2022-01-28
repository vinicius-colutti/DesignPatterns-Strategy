package com.colutti.designpatterns.strategy.service.impl;

import com.colutti.designpatterns.strategy.service.Calculator;
import com.colutti.designpatterns.strategy.service.Tax;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculatorImpl implements Calculator {

    @Override
    public BigDecimal calculateTax(BigDecimal value, Tax tax) {
        return tax.calculate(value);
    }

}
