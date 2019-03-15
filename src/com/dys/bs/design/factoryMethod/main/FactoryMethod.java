package com.dys.bs.design.factoryMethod.main;

import com.dys.bs.design.factoryMethod.SpecificFunctions.Function;
import com.dys.bs.design.factoryMethod.factoryIntefaces.Factory;
import com.dys.bs.design.factoryMethod.factoryIntefaces.impl.PlusFactory;

public class FactoryMethod {

    public static void main(String[] arg){
        //如果要增加新的具体实现，只需要修改客户端的实现工厂
        Factory factory = new PlusFactory();
        Function function = factory.createFunction();
        function.operation();
    }

}
