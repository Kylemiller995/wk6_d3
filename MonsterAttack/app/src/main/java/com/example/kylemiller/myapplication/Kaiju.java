package com.example.kylemiller.myapplication;

/**
 * Created by kylemiller on 06/09/2017.
 */

public abstract class Kaiju implements Damageable{
    String name;
    int healthValue;
    int attackValue;

    public Kaiju(String name, int healthValue, int attackValue){
        this.attackValue = attackValue;
        this.healthValue = healthValue;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public void attack(Damageable target){
        int attackValue = this.getAttackValue();
        target.takeDamage(attackValue);
    }

    public void takeDamage(int hitPoints){
        this.healthValue = this.healthValue - hitPoints;
    }
}
