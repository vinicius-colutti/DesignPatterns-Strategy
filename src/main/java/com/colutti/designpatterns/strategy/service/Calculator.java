package com.colutti.designpatterns.strategy.service;

import java.math.BigDecimal;

public interface Calculator {

    BigDecimal calculateTax(BigDecimal value, Tax tax);

}
