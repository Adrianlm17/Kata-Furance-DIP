package edu.craptocraft.kata_furance_dip.test_models;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.craptocraft.kata_furance_dip.models.RoomTemperature;

public class RoomTemperatureTest {

    @Test
    public void checkTemperatura() {

        double temperature = 20.0;
        RoomTemperature roomTemperature = RoomTemperature.getInstance();
        roomTemperature.setTemperature(temperature);
        double result = roomTemperature.getTemperature();
        assertEquals(temperature, result, 0.01);
    }
}
