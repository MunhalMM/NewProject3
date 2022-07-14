package com.telran.project;

import java.security.SecureRandom;

public class ToyotaCar {
    public final String PRODUCING_COUNTRY = "Japan";
    private String name ="All model";
    private int productionYear;
    private int maxSpeed;

    public static void carRides() {
        System.out.println("Car is capable of driving.");
    }

    public static void theCarIsNotRunning() {
        System.out.println("The car is unable to drive.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
