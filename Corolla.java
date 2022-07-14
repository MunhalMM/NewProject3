package com.telran.project;

public class Corolla extends ToyotaCar {
    private String name;
    private int productionYear;
    private int maxSpeed;

    public Corolla(String name, int productionYear, int maxSpeed) {
        this.name = name;
        this.productionYear = productionYear;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null && name.isEmpty()) {
            System.out.println("Enter a valid vehicle name!");
        }
        this.name = name;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        if (productionYear < 2016) {
            System.out.println("The car cannot be older than 8 years!");
        }
        this.productionYear = productionYear;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 260) {
            System.out.println("Pay attention to the allowed maximum speed!");
        }
        this.maxSpeed = maxSpeed;
    }
}
