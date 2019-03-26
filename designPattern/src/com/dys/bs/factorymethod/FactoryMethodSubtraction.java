package com.dys.bs.factorymethod;

/**
 * 减法工厂
 */
public class FactoryMethodSubtraction implements FactoryMethodCalculator {
    @Override
    public CalculatorInterface getCalculator() {
        return new CalculatorSubtraction();
    }
}
