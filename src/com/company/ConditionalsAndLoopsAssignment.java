package com.company;

public class ConditionalsAndLoopsAssignment {
    public static void main(String[] args) {
// Task
        // Write a program that will output the prime numbers between 1- 80.

        // Option 1
        /*boolean prime = true;
        for (int x = 1; x < 80; x++) {
            if (x == 2 || x  == 3 || x  == 5 || x  == 7)
            {
                System.out.println(x);
            }
            if (x == 1 || x % 2 == 0|| x % 3 == 0|| x % 4 == 0|| x % 5 == 0|| x % 7 == 0)
            {
                prime = false;
            }
            else {
            System.out.println(x);
            }
        }*/

        //Option 2
        /*for (int i = 2; i <= 80 ; i++) { // Run from 1 - 80,/

            int counter = 0; // Initialize counter to count the number of numbers that divide i.

            // If you divide a number into two, and those halves still can't divide that whole number without a remainder
            // it is prime. E.g if you divide 10 into two you get 5, but if you divide 11 into two you get 5.5,
            // 5.5 inside an integer will give you 5. 11/5 => 2.2
            for (int j = 2; j <= i / 2; j++) { // Nested loop. ( A loop inside of a loop)
                if (i % j == 0) { // if this returns true we know that the number is not prime.
                    counter++; // increase the count of numbers that divide i.
                }
            }

            // use the counter to check how many numbers divided i. If counter is greater than 0, then it is not prime.
            if (counter == 0) {
                System.out.println(i + " is prime.");
            }
        }*/

// Task
        // Write a program that will act as a simple calculator where you set a variable as the operator and based on that
        // perform an arithmetic operation. For example if the operator variable is "+" then it will add two numbers  and so on.

        /*char operator = '+';
        float firstnumber = 1;
        float secondnumber = 2;
        if (operator == '+') {
            System.out.println("Answer is " + (firstnumber + secondnumber));
        }
        if (operator == '-') {
            System.out.println("Answer is " + (firstnumber - secondnumber));
        }
        if (operator == '*') {
            System.out.println("Answer is " + (firstnumber * secondnumber));
        }
        if (operator == '/') {
            System.out.println("Answer is " + (firstnumber / secondnumber));


        }*/
    }
}
