package com.dys.bs.strategy;

/**
 * 策略模式，上下文
 * 由上下文来维护底层实现而转变的策略
 */
public class ContextStrategy {
    private Consumption consumption;

    /**
     * 由接口类型来提供消费
     * @param consumption
     */
    public ContextStrategy(Consumption consumption){
        this.consumption = consumption;
    }

    public void calculation(){
        this.consumption.computationalConsumption();
    }

}
