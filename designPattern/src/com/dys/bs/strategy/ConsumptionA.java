package com.dys.bs.strategy;

public class ConsumptionA implements Consumption {
    @Override
    public void computationalConsumption() {
        this.eating();
        this.fare();
    }

    private void eating(){
        System.out.println("我在吃蛋糕！");
    }

    private void fare(){
        System.out.println("路程消费中。。。。");
    }

}
