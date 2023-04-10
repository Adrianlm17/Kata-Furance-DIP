package edu.craptocraft.kata_furance_dip.domains;

import edu.craptocraft.kata_furance_dip.interfaces.Heater;
import edu.craptocraft.kata_furance_dip.models.RoomTemperature;

public class GasHeater implements Heater {

    @Override
    public void engage(RoomTemperature temperature) {
        temperature.updateTemperature(1);
    }

    @Override
    public void disengage(RoomTemperature temperature) {
        temperature.updateTemperature(-1);
    }
}
