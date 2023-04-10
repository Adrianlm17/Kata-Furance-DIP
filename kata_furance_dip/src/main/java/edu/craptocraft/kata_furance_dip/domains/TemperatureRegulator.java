package edu.craptocraft.kata_furance_dip.domains;

import edu.craptocraft.kata_furance_dip.interfaces.Heater;
import edu.craptocraft.kata_furance_dip.interfaces.Regulator;
import edu.craptocraft.kata_furance_dip.interfaces.Thermometer;
import edu.craptocraft.kata_furance_dip.models.RoomTemperature;

public class TemperatureRegulator implements Regulator {

    double maxTemp;
    double minTemp;

    public TemperatureRegulator(double maxTemp, double minTemp) {
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
    }


    public double getMaxTemp() {
        return maxTemp;
    }


    public double getMinTemp() {
        return minTemp;
    }

    

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }


    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }


    @Override
    public void regulate(Thermometer thermometer, Heater heater, RoomTemperature temperature) {
        
        while (thermometer.read(temperature) < this.maxTemp) {
            heater.engage(temperature);
        }

        while (thermometer.read(temperature) > this.minTemp) {
            heater.disengage(temperature);
        }

    }


    @Override
    public String toString() {
        return "\n\t\tTemperatura maxima:" + maxTemp + "\n\t\t Temperatura minima:" + minTemp;
    }
    
}
