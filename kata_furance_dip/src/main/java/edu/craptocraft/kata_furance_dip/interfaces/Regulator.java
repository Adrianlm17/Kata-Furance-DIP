package edu.craptocraft.kata_furance_dip.interfaces;

import edu.craptocraft.kata_furance_dip.models.RoomTemperature;

public interface Regulator {

    void regulate(Thermometer thermometer, Heater heater, RoomTemperature temperature);
}
