package com.example.kylemiller.myapplication;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by kylemiller on 06/09/2017.
 */

public class ArmyVehicleTest {

    ArmyVehicle armyVehicle;
    Godzilla godzilla;

    @Before
    public void before(){
        armyVehicle = new ArmyVehicle("Tank", 10, 2);
        godzilla = new Godzilla("Godzilla", 20, 8);
    }

    @Test
    public void testHastype(){
        assertEquals(armyVehicle.getType(), "Tank");

    }

    @Test
    public void testHasHealth(){
        assertEquals(armyVehicle.getHealthValue(), 10);
    }

    @Test
    public void testCanAttack(){
        armyVehicle.attack(godzilla);
        assertEquals(godzilla.getHealthValue(), 18);
    }

    @Test
    public void testCanMove(){
        assertEquals(armyVehicle.move(), "vroom");
    }

    @Test
    public void testHealthDecreasesAfterAttack(){
        godzilla.attack(armyVehicle);
        assertEquals(armyVehicle.getHealthValue(), 2);
    }
}
