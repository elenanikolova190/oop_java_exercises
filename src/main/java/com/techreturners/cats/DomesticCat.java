package com.techreturners.cats;

public class DomesticCat extends MyCats{

    private String setting;
    private int height;

    public DomesticCat() {
        this.setting = "domestic";
        this.height = 23;
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
        return "Purrrrrrr";
    }

}
