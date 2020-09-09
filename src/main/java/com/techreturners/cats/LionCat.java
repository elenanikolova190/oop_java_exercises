package com.techreturners.cats;

public class LionCat extends MyCats{

    private String setting;
    private int height;

    public LionCat() {
        this.setting = "wild";
        this.height = 1100;
    }

    @Override
    public String getSetting(){
        return this.setting;
    }
    
    @Override
    public int getAverageHeight(){
        return this.height;
    }

    @Override
    public String eat(){
        return "Roar!!!!";
    }

}
