package com.company.person;

public class Person {

    // Define the properties or attributes of a person
    private String name;
    private int age;
    private float height;
    private float weight;

    // Getters - allow us read data from the class
//    public String getName() {
//        return name;
//    }
//
//    // Setters - allow us to write data to the class
//    public void setName(String name) {
//        this.name = name;
//    }


    // Constructor - A constructor is a utility that allows us to
    // create instances of objects
    // Should be public and have the same name as the class.

//        public Person() { // default constructor with no parameters allows creating new empty object
//
//    }
//
    public Person (String name, int age) {
    this.name = name;
    this.age = age;
    }

    // Method/Constructor overloading -> This is a way to define multiple constructors or methods
    // with the same name, but they must have different method/constructor signatures. Version of the polymorphism

    // Method/Constructor signatures -> This is the number and data type of the parameters and
    // the order in which those parameters are defined.




    public int getAge() {
        return age;
    }

//    public void setAge(int age) { // in case we should only be able to set age inside of this class, this setter should be removed
//       this.age = age;
//    }

//    public void changeAge() {
//        age++;
//    }

// BMI Method
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float BMI (){
       return weight / (height*height);
    }


}