package com.dys.bs.decorate;

/**
 * 添加红色
 */
public class RedColourPainting extends ColourPainting {

    @Override
    public void option(){
        super.option();
        System.out.println("添加红色。。。。");
    }

}
