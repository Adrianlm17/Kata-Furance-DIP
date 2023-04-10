package edu.craptocraft.kata_furance_dip;

import edu.craptocraft.kata_furance_dip.domains.GasHeater;
import edu.craptocraft.kata_furance_dip.domains.RemoteCommandSensor;
import edu.craptocraft.kata_furance_dip.domains.TemperatureRegulator;
import edu.craptocraft.kata_furance_dip.interfaces.Heater;
import edu.craptocraft.kata_furance_dip.interfaces.Regulator;
import edu.craptocraft.kata_furance_dip.interfaces.Thermometer;
import edu.craptocraft.kata_furance_dip.models.RoomTemperature;

public class App {
    public static void main(String[] args) {

        final double minTemp = 15.0;
        final double maxTemp = 21.0;

        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(17);

        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();

        Regulator regulator = new TemperatureRegulator(minTemp, maxTemp);

        System.out.println("Arrancando...");
        regulator.regulate(thermometer, heater, temperature);
        System.out.println(temperature.toString());

        temperature.setTemperature(12);
        System.out.println("Arrancando...");
        regulator.regulate(thermometer, heater, temperature);
        System.out.println(temperature.toString());

        temperature.setTemperature(25);
        System.out.println("Arrancando...");
        regulator.regulate(thermometer, heater, temperature);
        System.out.println(temperature.toString());

    }
}
