
package com.techreturners.cats;

public class CheetahCat extends MyCats{

    private String setting;
    private int height;

    public CheetahCat() {
        this.setting = "wild";
        this.height = 900;
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
        return "Zzzzzzz";
    }

}
