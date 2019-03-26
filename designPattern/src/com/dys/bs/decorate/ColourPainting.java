package com.dys.bs.decorate;

/**
 * 颜色
 */
public abstract class ColourPainting implements Painting {
    private Painting painting;

    public void setPainting(Painting painting){
        this.painting = painting;
    }

    @Override
    public void option(){
        if(null != painting){
            painting.option();
        }
    }
}