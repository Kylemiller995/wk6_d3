package com.example.kylemiller.myapplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kylemiller on 06/09/2017.
 */

public class NavalVehicleTest {
    NavalVehicle navalVehicle;

    @Before
    public void before(){
        navalVehicle = new NavalVehicle("Frigate", 15, 3);
    }

    @Test
    public void testHastype(){
        assertEquals(navalVehicle.getType(), "Frigate");

    }

    @Test
    public void testHasHealth(){
        assertEquals(navalVehicle.getHealthValue(), 15);
    }

    @Test
    public void testHasAttack(){
        assertEquals(navalVehicle.getAttackValue(), 3);
    }

    @Test
    public void testCanMove(){
        assertEquals(navalVehicle.move(), "full steam ahead!");
    }
}
