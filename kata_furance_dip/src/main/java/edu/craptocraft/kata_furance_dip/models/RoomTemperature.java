package edu.craptocraft.kata_furance_dip.models;

public class RoomTemperature {

    private double temperature;
    private static RoomTemperature instance;

    private RoomTemperature() {}

    public static RoomTemperature getInstance() {
        if (instance == null) {
            instance = new RoomTemperature();
        }
        return instance;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void updateTemperature(double value){
        this.setTemperature(this.getTemperature() + value);
    }

    @Override
    public String toString() {
        return "La Temperatura actual es de: " + this.temperature;
    }
}
