package com.dys.bs.design.factoryMethod.factoryIntefaces.impl;

import com.dys.bs.design.factoryMethod.SpecificFunctions.Function;
import com.dys.bs.design.factoryMethod.SpecificFunctions.impl.PlusSpecificFunctions;
import com.dys.bs.design.factoryMethod.factoryIntefaces.Factory;

/**
 * 实现工厂 加法
 */
public class PlusFactory implements Factory {
    @Override
    public Function createFunction() {
        return new PlusSpecificFunctions();
    }
}
