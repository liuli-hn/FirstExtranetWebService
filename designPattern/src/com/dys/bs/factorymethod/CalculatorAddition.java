package com.dys.bs.factorymethod;

/**
 * 计算器加法
 */
public class CalculatorAddition implements CalculatorInterface {

    @Override
    public void resultsOfEnforcement(Integer A, Integer B) {
        System.out.println("A + B = " + (A + B));
    }

}
