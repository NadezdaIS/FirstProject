package com.company.person;

import com.company.person.Person;

public class Persons {

    // define properties of the class
    private Person[] people; // this object is an array of Person-class objects

    public Persons(Person[] people) { // constructor
        this.people = people;
    }

    public float getAverageAge() {
        float sum = 0; // initialize the sum variable to zero
        // for-each loop
        for(Person person : people) {
            // person == person[i]
            sum += person.getAge();
        }

        return sum / people.length;
    }
}
