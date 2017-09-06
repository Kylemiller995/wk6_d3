package com.example.kylemiller.myapplication;

/**
 * Created by kylemiller on 06/09/2017.
 */

public class Godzilla extends Kaiju implements Moveable{
    public Godzilla(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String move() {
        return "ah cannae fly";
    }

}
