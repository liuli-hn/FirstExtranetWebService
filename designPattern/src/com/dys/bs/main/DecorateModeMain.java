package com.dys.bs.main;

import com.dys.bs.decorate.*;

public class DecorateModeMain {

    public static void main(String[] arg){

        // 彩虹结构
        Painting rainbowPainting = new RainbowPainting();
        //添加颜色
        ColourPainting redColour = new RedColourPainting();//红色
        ColourPainting yellowColor = new YellowColorPainting();

        redColour.setPainting(rainbowPainting);
        yellowColor.setPainting(redColour);
        yellowColor.option();
    }

}

