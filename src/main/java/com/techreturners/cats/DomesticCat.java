package com.techreturners.cats;
import java.util.Random;

public class DomesticCat extends CatObject {

    public DomesticCat() {
        super(23, "domestic");
    }

    @Override
    public String eat() {
        return getRandomComment();
    }

    private static String getRandomComment() {
        String[] random_comment = {"Purrrrrrr", "It will do I suppose"};
        int rnd = new Random().nextInt(random_comment.length);
        return random_comment[rnd];
    }
} 