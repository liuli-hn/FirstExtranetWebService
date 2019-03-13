package com.dys.bs.design.decorate.intefaceEntity.impl;

import com.dys.bs.design.decorate.intefaceEntity.Decorate;

public class DecorateImpl implements Decorate {

    private Decorate decorate;

    public void setDecorate(Decorate decorate){
        this.decorate = decorate;
    }
    @Override
    public void show() {
        System.out.println("");
    }
}
