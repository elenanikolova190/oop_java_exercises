package com.techreturners.cats;

abstract class CatObject implements Cat {

    private Boolean asleep = false;
    public int averageHeight;
    public String setting;

    public CatObject(int averageHeight, String setting) {
        this.averageHeight = averageHeight;
        this.setting = setting;
    }

    public Boolean isAsleep() {
        return this.asleep;
    }

    public int getAverageHeight() {
        return this.averageHeight;
    }

    public String getSetting() {
        return this.setting;
    }

    public void goToSleep() {
        this.asleep = true;
    }

    public void wakeUp() {
        this.asleep = false;
    } 
}