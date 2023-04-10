package edu.craptocraft.kata_furance_dip.interfaces;

import edu.craptocraft.kata_furance_dip.models.RoomTemperature;

public interface Heater {
    
    void engage(RoomTemperature temperature);

    void disengage(RoomTemperature temperature);
}
