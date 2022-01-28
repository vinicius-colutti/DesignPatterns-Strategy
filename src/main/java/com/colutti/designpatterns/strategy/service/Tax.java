package com.colutti.designpatterns.strategy.service;

import java.math.BigDecimal;

public interface Tax {

    BigDecimal calculate(BigDecimal value);

}
