package com.telran.project;

public class Main {
    public static void main(String[] args) {
        ToyotaCar allCars = new ToyotaCar();
        LandCruiser landCruiser = new LandCruiser("Land Cruise", 2020, 280);
        Corolla corolla = new Corolla("Corolla", 2021, 260);
        Camry camry = new Camry("Camry", 2022, 320);

        ToyotaCar[] toyotaCars = {landCruiser, corolla, camry, allCars};
        printAllToyotaCars(toyotaCars);
    }

    public static void printAllToyotaCars(ToyotaCar[] model) {
        for (ToyotaCar toyotaCar : model) {
            System.out.println("Toyota model is : " + toyotaCar.getName() + "   Production year is : " + toyotaCar.getProductionYear()
                    + "   Maximal speed is : " + toyotaCar.getMaxSpeed() + "   Producing country is : " + toyotaCar.PRODUCING_COUNTRY);
        }

    }
}
