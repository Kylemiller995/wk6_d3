package com.example.kylemiller.myapplication;

/**
 * Created by kylemiller on 06/09/2017.
 */

public class Rodan extends Kaiju implements Moveable{
    public Rodan(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }
    public String move() {
        return "*wings flutter*";
    }
}
