package com.dys.bs.factorymethod;

/**
 * 加法工厂
 */
public class FactoryMethodAddition implements FactoryMethodCalculator{

    @Override
    public CalculatorInterface getCalculator() {
        return new CalculatorAddition();
    }
}
