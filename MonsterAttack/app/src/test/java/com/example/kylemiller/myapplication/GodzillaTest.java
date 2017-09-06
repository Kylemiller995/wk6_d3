package com.example.kylemiller.myapplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kylemiller on 06/09/2017.
 */

public class GodzillaTest {
    Godzilla godzilla;
    ArmyVehicle armyVehicle;

    @Before
    public void before(){
        godzilla = new Godzilla("Godzilla", 20, 8);
        armyVehicle = new ArmyVehicle("Tank", 10, 2);
    }
    @Test
    public void testHasName(){
        assertEquals(godzilla.getName(), "Godzilla");
    }

    @Test
    public void testHasAttack(){
        assertEquals(godzilla.getAttackValue(), 8);
    }

    @Test
    public void testHasHealth(){
        assertEquals(godzilla.getHealthValue(), 20);
    }

    @Test
    public void testCanMove(){
        assertEquals(godzilla.move(), "ah cannae fly");
    }

    @Test
    public void testCanAttack(){
        godzilla.attack(armyVehicle);
        assertEquals(armyVehicle.getHealthValue(), 2);
    }
}
