package com.company.oop;

public class Calculator {
    // static is the opposite of instance, means that the particular member belongs to a type itself,
    // rather than to an instance of that type

    // instance variable is a variables whose values are attached to a particular
    // instance of an object.

    // instance method is a method that is attached to a particular instance of an
    // object

    // static method, should be called without creating new instance
    // is an instance method, we should create new instance before using it

    public static int add (int smallNumber, int bigNumber) {
        return smallNumber + bigNumber; // static method
    }

    public static int subtract (int smallNumber, int bigNumber) {
        return bigNumber - smallNumber;
    }

    public static int multiply (int smallNumber, int bigNumber) {
        return smallNumber * bigNumber;
    }

    public float divide (float smallNumber, float bigNumber) {
        return bigNumber / smallNumber; // instance method
    }
    // In case of calculator we do not need to use instance method
}