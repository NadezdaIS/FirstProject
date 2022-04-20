package com.company.oop;

public class Rectangle {

    private float length;
    private float breadth;

    public Rectangle(float length, float breadth) {
    this.length=length;
    this.breadth=breadth;
    }

    public float perimeter() {
        return (length + breadth)*2;
    }
    public float area (){
        return length*breadth;
    }



}
