package com.colutti.designpatterns.strategy.service.impl;

import com.colutti.designpatterns.strategy.service.Tax;

import java.math.BigDecimal;

public class ISS implements Tax {
    @Override
    public BigDecimal calculate(BigDecimal value) {
        return value.multiply(new BigDecimal("0.01"));
    }
}
