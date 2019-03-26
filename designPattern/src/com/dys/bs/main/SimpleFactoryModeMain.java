package com.dys.bs.main;

import com.dys.bs.simple.CalculatorInterface;
import com.dys.bs.simple.SimpleFactory;

/**
 * 简单工厂模式主程序
 */
public class SimpleFactoryModeMain {

    public static void main(String[] agr){

        SimpleFactory simpleFactory = new SimpleFactory();
        CalculatorInterface calculator = simpleFactory.getCalculator("+");

        calculator.resultsOfEnforcement(5,6);

    }

}
