package edu.craptocraft.kata_furance_dip.domains;

import edu.craptocraft.kata_furance_dip.interfaces.Thermometer;
import edu.craptocraft.kata_furance_dip.models.RoomTemperature;

public class RemoteCommandSensor implements Thermometer {

    @Override
    public double read(RoomTemperature temperature) {
        return temperature.getTemperature();
    }
    
}
