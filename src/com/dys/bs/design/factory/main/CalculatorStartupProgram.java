package com.dys.bs.design.factory.main;

import com.dys.bs.design.factory.interfaceEntity.CalculatorOperation;
import com.dys.bs.design.factory.interfaceEntity.impl.CalculatorOperationAdditionImpl;
import com.dys.bs.design.factory.interfaceEntity.impl.CalculatorOperationDefaultImpl;

/**
 * 计算器启动程序
 * 简单的工厂模式+策略模式
 */
public class CalculatorStartupProgram {

    public static void main(String[] arg){
        // 业务 逻辑 结果
        CalculatorStartupProgram.switchOperation("addition",5,5);
    }

    /**
     * 简单的工厂模式
     * @param operation
     * @param numA
     * @param numB
     */
    public static void switchOperation(String operation,Integer numA,Integer numB){
        CalculatorOperation calculatorOperation = null;
        switch (operation){
            case "addition":
                calculatorOperation = new CalculatorOperationAdditionImpl();
                break;
            default:
                calculatorOperation = new CalculatorOperationDefaultImpl();
                break;
        }
        CalculatorStartupProgram.operation(calculatorOperation,numA,numB);
    }


    private static void operation(CalculatorOperation calculatorOperation,Integer numA,Integer numB){
        Integer num = calculatorOperation.operationMode(numA, numB);
        System.out.println(num);
    }

}
