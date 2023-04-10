package edu.craptocraft.kata_furance_dip.test_domains;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import edu.craptocraft.kata_furance_dip.domains.GasHeater;
import edu.craptocraft.kata_furance_dip.models.RoomTemperature;

public class GasHeaterTest {

    private GasHeater gasHeater;

    @Before
    public void checkOn() {
        this.gasHeater = new GasHeater();
    }

    @Test
    public void checkMasUno() {
        RoomTemperature temperature = RoomTemperature.getInstance();
        double initialTemperature = temperature.getTemperature();
        gasHeater.engage(temperature);
        assertEquals(initialTemperature + 1, temperature.getTemperature(), 0);
    }

    @Test
    public void checkMenosUno() {
        RoomTemperature temperature = RoomTemperature.getInstance();
        double initialTemperature = temperature.getTemperature();
        gasHeater.disengage(temperature);
        assertEquals(initialTemperature - 1, temperature.getTemperature(), 0);
    }
    
}