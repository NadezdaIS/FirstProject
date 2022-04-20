package com.company.oop.car;
// public class will be available outside the package, class cannot be private
// if class written without stating it is public, it will only be available inside the package,
// package-protected class would only be available in OOP package in this case
public class Car {
    // Define the attributes of the object
    // private means it is not available outside the class, class cannot be private
    private String color = "BLUE";
    private int numOfTires = 4;
    private boolean engineOn = false;

    public Car(int numOfTires) { // constructor
        this.numOfTires = numOfTires;
    }


    // define their behaviours by using Methods
    // start engine
    public void startEngine(boolean key) { // example of the instance method
        if (key && !engineOn) {
            System.out.println("Engine Started");
            engineOn = true;
        } else {
            System.out.println("Key not in! Can't start");
        }
    }
    // stop engine
    public void stopEngine() {
        if (engineOn) {
            System.out.println("Engine turned off!");
            engineOn = false;
        } else {
            System.out.println("Engine already off!");
        }
    }
}
