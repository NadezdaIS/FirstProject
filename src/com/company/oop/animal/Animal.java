package com.company.oop.animal;

public class Animal {



    private String name;
    private int legs;
    private String sound;

    public Animal(String name, int legs, String sound) {
    this.legs = legs;
    this.name = name;
    this.sound = sound;
    }


    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    // define behaviour
    public void voice() {
        System.out.println(name + " says " + sound);
    }


}
