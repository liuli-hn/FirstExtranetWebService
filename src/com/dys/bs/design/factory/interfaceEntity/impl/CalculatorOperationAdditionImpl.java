package com.dys.bs.design.factory.interfaceEntity.impl;

import com.dys.bs.design.factory.interfaceEntity.CalculatorOperation;

/**
 * 加法运算
 */
public class CalculatorOperationAdditionImpl implements CalculatorOperation {


    @Override
    public Integer operationMode(Integer numA, Integer numB) {
        return numA+numB;
    }
}
