package com.techreturners.cats;

public class LionCat extends CatObject {

    public LionCat() {
        super(1100, "wild");
    }

    @Override
    public String eat() {
        return "Roar!!!!";
    }
} 
