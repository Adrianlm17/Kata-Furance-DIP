package edu.craptocraft.kata_furance_dip.test_domains;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import edu.craptocraft.kata_furance_dip.domains.RemoteCommandSensor;
import edu.craptocraft.kata_furance_dip.models.RoomTemperature;

public class RemoteCommandSensorTest {

    @Test
    public void checkRead() {
        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(25);
        RemoteCommandSensor sensor = new RemoteCommandSensor();
        double readValue = sensor.read(temperature);
        assertEquals(25, readValue, 0.01);
    }
}
