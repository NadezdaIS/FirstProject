package com.company.oop.car;

public class Ferrari extends Car {
    private boolean engineOn = false; // imported from Car class for overriding method startEngine
    private String color;
    private String model;

    public Ferrari(int numOfTires, String color, String model) {
        super(numOfTires); // stands for parent constructor
        this.color = color;
        this.model = model;
    }


    // Method overriding, version of polymorphism

    public void startEngine(boolean key) {
        if (key && !engineOn) {
            System.out.println("Engine Started");
            engineOn = true;
        } else {
            System.out.println("Key not in! Can't start");
        }
    }

        public void startEngine () {
            System.out.println("Started");
        }

        public void openWindowDoors () {
            System.out.println("Window doors opened!");
        }


    }
