package OCP.Classes;

import OCP.Interfaces.SpeedCalculation;

public class Vehicle implements SpeedCalculation {
    int maxSpeed;
    String type;
    
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    
    public String getType() {
        return this.type;
    }

    @Override
    public double calculateAllowedSpeed() {
        return maxSpeed;
    }



}