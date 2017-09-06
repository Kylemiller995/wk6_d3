package com.example.kylemiller.myapplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kylemiller on 06/09/2017.
 */

public class RodanTest {

    Rodan rodan;
    ArmyVehicle armyVehicle;

    @Before
    public void before(){
        rodan = new Rodan("Rodan", 17, 9);
        armyVehicle = new ArmyVehicle("Tank", 10, 2);
    }
    @Test
    public void testHasName(){
        assertEquals(rodan.getName(), "Rodan");
    }

    @Test
    public void testHasAttack(){
        assertEquals(rodan.getAttackValue(), 9);
    }

    @Test
    public void testHasHealth() {
        assertEquals(rodan.getHealthValue(), 17);
    }

    @Test
    public void testCanAttack(){
        rodan.attack(armyVehicle);
        assertEquals(armyVehicle.getHealthValue(), 1);
    }

    @Test
    public void testCanMove(){
        assertEquals(rodan.move(), "*wings flutter*");
    }
}
