package com.dys.bs.simple;

/**
 * 减法
 */
public class CalculatorSubtraction implements CalculatorInterface {

    @Override
    public void resultsOfEnforcement(Integer A, Integer B) {
        if(A >= B){
            System.out.println("A - B = " + (A - B));
        }else{
            System.out.println("本次计算忽略，不支持减法负数！");
        }
    }

}
