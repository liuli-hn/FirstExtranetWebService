package com.dys.bs.main;

import com.dys.bs.strategy.ConsumptionA;
import com.dys.bs.strategy.ContextStrategy;

/**
 * 消费策略主程序
 */
public class StrategyMain {

    public static void main(String[] arg){
        //由构造函数提供具体实施策略消费
        ContextStrategy contextStrategy = new ContextStrategy(new ConsumptionA());
        contextStrategy.calculation();

    }

}
