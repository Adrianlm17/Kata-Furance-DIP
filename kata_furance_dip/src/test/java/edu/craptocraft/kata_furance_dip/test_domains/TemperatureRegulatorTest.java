package edu.craptocraft.kata_furance_dip.test_domains;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import edu.craptocraft.kata_furance_dip.domains.GasHeater;
import edu.craptocraft.kata_furance_dip.domains.RemoteCommandSensor;
import edu.craptocraft.kata_furance_dip.domains.TemperatureRegulator;
import edu.craptocraft.kata_furance_dip.interfaces.Heater;
import edu.craptocraft.kata_furance_dip.interfaces.Regulator;
import edu.craptocraft.kata_furance_dip.interfaces.Thermometer;
import edu.craptocraft.kata_furance_dip.models.RoomTemperature;


public class TemperatureRegulatorTest {

    public static RoomTemperature temperature;
    public static Heater heater;
    public static Thermometer thermometer;
    public static Regulator regulator;
    
    @Before
    public void crearRegulador() {
        temperature = RoomTemperature.getInstance();
        heater = new GasHeater();
        thermometer = new RemoteCommandSensor();
        regulator = new TemperatureRegulator(15.0, 21.0);
    }

    @Test
    public void checkEnciende() {

        temperature.setTemperature(10.0);
        assertEquals(10.0, temperature.getTemperature(), 0);
        regulator.regulate(thermometer, heater, temperature);
        assertEquals(15.0, temperature.getTemperature(), 0);

    }

    @Test
    public void checkApaga() {

        temperature.setTemperature(25.0);
        assertEquals(25.0, temperature.getTemperature(), 0);
        regulator.regulate(thermometer, heater, temperature);
        assertEquals(21.0, temperature.getTemperature(), 0);
    }

}
