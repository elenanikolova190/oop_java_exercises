package com.techreturners.cats;

abstract class MyCats implements Cat{

    private boolean  asleep;

    public void MyCats() {
        this.asleep = false;
    }

    public boolean isAsleep(){
        return this.asleep;
    }

    public void goToSleep(){
        this.asleep = true;
    } 

    public void wakeUp() {
        this.asleep = false;
    }

    public abstract String getSetting();
    public abstract int getAverageHeight();
    public abstract String eat();

}