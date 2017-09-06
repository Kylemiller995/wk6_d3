package com.example.kylemiller.myapplication;

/**
 * Created by kylemiller on 06/09/2017.
 */

public class ArmyVehicle extends Vehicle implements Moveable {
    public ArmyVehicle(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }

    public String move(){
        return "vroom";
    }
}
