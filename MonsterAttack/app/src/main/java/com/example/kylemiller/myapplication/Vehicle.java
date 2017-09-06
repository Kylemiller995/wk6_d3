package com.example.kylemiller.myapplication;

/**
 * Created by kylemiller on 06/09/2017.
 */

public abstract class Vehicle implements Damageable{
    String type;
    int healthValue;
    int attackValue;

    public Vehicle(String type, int healthValue, int attackValue){
        this.healthValue = healthValue;
        this.type = type;
        this.attackValue = attackValue;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void attack(Damageable thingToAttack) {
        int attackValue = this.getAttackValue();
        thingToAttack.takeDamage(attackValue);
    }

    public void takeDamage(int healthPoints){
        this.healthValue -= healthPoints;
    };

}
