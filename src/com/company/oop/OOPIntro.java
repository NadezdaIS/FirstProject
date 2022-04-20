package com.company.oop;

import com.company.oop.car.Bugatti;
import com.company.oop.car.Ferrari;
import com.company.oop.company.Company;
import com.company.oop.company.Employee;
// should be imported as it is class from a different package

public class OOPIntro {

    // OOP -> programming paradigm
    // paradigm -> a way of viewing things.

    // A class is a blueprint for describing an object, both attributes and behaviour
    // Car -> Attributes: color, model, numOfTires, numOfSeats.
    // Behaviour: startEngine, stopEngine, turnRight, turnLeft.

    // fields -> used to define attributes in a class. Another name for fields is global variable
    // (available to more than 1 method).

    // Encapsulation
    // This a concept of hiding data and methods from the outside world (Classes outside of the
    // one the data is defined in)
    // This allows us to control what data is given out or received.

    // Inheritance
    // This is a mechanism that allows us to share behaviour between classes
    // A class that inherits from another class is called the 'child' or 'sub' class. The class that
    // is inherited from is the 'parent' or 'super' class.

    // Polymorphism
    // The ability of an object to return different responses to the same method call.

    public static void main(String[] args) {
//        Car benz = new Car(); // creating the new instance of the Car class,
//        so we could use instance methods on that
//        benz.startEngine(false);
//        benz.stopEngine();

//        System.out.println();

//        Car bmw = new Car(); // different instance of the same class
//        bmw.startEngine(true);
//        bmw.stopEngine();

//        System.out.println(Calculator.add(2, 4)); // calling static method directly

//        Calculator calc = new Calculator(); // creating the new instance to call instance method
//        System.out.println(Calculator.divide(3, 8));


//        Person person = new Person (); // example of the constructor
//        person.getName(); // getter is called
//        System.out.print(person.getName());

//        Person george = new Person();
//        george.setName ("George");
//        Person victoria = new Person();
//        victoria.setName ("Victoria");
//
//        System.out.println(george.getName());
//        System.out.println(victoria.getName());


//          Person george = new Person("George", 28); // calling the constructor
//          Person victoria = new Person("Victoria", 29);
//          victoria.changeAge();
//          System.out.println(victoria.getAge());

// Task
// For the person class we've written today. Write a method that
// that allows you to find the BMI of a particular person, using what you've learnt
// today. height should be in meters and the weight should be in kg.

//        victoria.setHeight(1.52f);
//        victoria.setWeight(60);
//        System.out.println(victoria.BMI());

// Task
// Create a new class called Rectangle and in that class, define two properties of a
// rectangle which are the length and the breadth. Create a constructor to allow instantiation
// of the rectangles at object creation and also write methods to find the perimeter and area
// of the rectangle.
//        Rectangle rectangle = new Rectangle(5,6);
//        System.out.println(rectangle.area());

// Task
// Write a method that takes an array of 5 Persons as a parameter and then returns
// the average age of the array of Persons as its output.

//        Person[] people = new Person[] { // calling the constructor
//                new Person("George", 22),
//                new Person("Fred", 18),
//                new Person("David", 20),
//        };


//      Persons persons = new Persons(people);
//      System.out.println("Average age: " + getAverageAge(people));


// Can also be done without creating Persons class, but it is not really OOP
//      System.out.println("Average age: " + getAverageAge(people) );


        Ferrari ferrari = new Ferrari(4, "red", "Turbo 3000");
        ferrari.openWindowDoors();

        Bugatti bugatti = new Bugatti(4, "red", "Turbo 3000");
        bugatti.startEngine(true);
// Task
// Write two classes
// Animal class Fields - String type, String number of legs
// Methods - String sounds it makes, movement

// Bird - fields: color, doesItFly
// Methods - fly (), sing()
//        Bird penguin = new Bird("Penguin", 2, "Bleat", "Black and white", false);
//
//        penguin.sing();
//        penguin.fly();

// Task
// Create a class called Person(Parent class). They should have:
// name, age.
// Create a class called Employee(Child class). This class should inherit
// the Person class. and should have the extra fields:
// company id, company name.
// Create a class called Company. This class should take in employees as
// an array attribute,  and have a name.
// In your main method, Populate a company’s employees attribute and find the average
// age of the employees.

        String google = "Google", microsoft = "Microsoft";

        Company goog = new Company(google);
        Company micro = new Company(microsoft);

        Employee[] googleWorkers = new Employee[] {
                new Employee("Fred", 33, goog),
                new Employee("Rachel", 30, goog),
        };

        Employee[] microsoftWorkers = new Employee[] {
                new Employee("George", 28, micro),
                new Employee("Victoria", 31, micro),
        };
// inheritance has a "is-a" relationship
// composition is more of a "has-a" relationship

        goog.setEmployees(googleWorkers);
        micro.setEmployees(microsoftWorkers);

        System.out.println(googleWorkers[0].getCompany().getCompanyName());

        System.out.println(googleWorkers[0].getCompany().getEmployees().length);


        System.out.println(goog.getAverageAge());
        System.out.println(micro.getAverageAge());

    }

//    public static float getAverageAge (Person[] people) {
//        float sum = 0; // initialize the sum variable to zero
//        // for-each loop
//        for(Person person : people) {
//            // person == person[i]
//            sum += person.getAge();
//        }
//
//        return sum / people.length;

//    }



}
