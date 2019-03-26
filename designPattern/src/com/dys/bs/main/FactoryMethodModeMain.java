package com.dys.bs.main;

import com.dys.bs.factorymethod.CalculatorInterface;
import com.dys.bs.factorymethod.FactoryMethodAddition;
import com.dys.bs.factorymethod.FactoryMethodCalculator;

/**
 * 工厂方法主程序
 */
public class FactoryMethodModeMain {

    public static void main(String[] arg){
        FactoryMethodCalculator factoryMethodCalculator = new FactoryMethodAddition();
        CalculatorInterface calculator = factoryMethodCalculator.getCalculator();
        calculator.resultsOfEnforcement(5,6);

    }
}
