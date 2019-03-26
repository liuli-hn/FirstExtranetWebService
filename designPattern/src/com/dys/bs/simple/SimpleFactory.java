package com.dys.bs.simple;

/**
 * 计算器简单工厂
 */
public class SimpleFactory {

    public CalculatorInterface getCalculator(String choice){
        switch(choice){
            case "+":
                return new CalculatorAddition();
            case "-":
                return new CalculatorSubtraction();
        }
        return null;
    }

}
