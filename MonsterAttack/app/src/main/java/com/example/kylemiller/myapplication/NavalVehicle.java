package com.example.kylemiller.myapplication;

/**
 * Created by kylemiller on 06/09/2017.
 */

public class NavalVehicle extends Vehicle implements Moveable{
    public NavalVehicle(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }

    public String move(){
        return "full steam ahead!";
    }
}
