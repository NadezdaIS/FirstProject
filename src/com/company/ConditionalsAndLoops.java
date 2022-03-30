package com.company;

public class ConditionalsAndLoops {
    public static void main(String[] args) {

        // Conditionals is simply a way of telling the computer to perform certain actions based on
        // certain conditions.

// Task
        // Using an if else statement print out numbers between 8 and 14 that are greater than 9.

        /*int number = 15;
        if (number > 9 && number < 14) {
            System.out.println(number+ " is between 8 and 14");
        }
        else {
        } System.out.println(number+ " is not between 8 and 14");*/

        // Loops are a construct that allows us to repeat a set of commands
        // until a condition to terminate is reached

        // Do-While loop is basically saying do this for as long as the condition is true.

        /*int count = 0;
        do {
            System.out.println(count); // print out the count
            count = count + 1; // increase the count by 1
        } while (count < 10);*/

        // While loop checks the condition first and then executes the statement(s),
        // whereas Do-While loop will execute the statement(s) at least once, then the condition is checked.

        // While loop is basically saying do this.
        // PRO-TIP: Use while loop when you don't have an idea of how many times the loop is supposed to run.
        /*while (count < 11) {
            System.out.println(count);
            count = count + 1;
        }*/

        // For loop is typically used when you have an idea of how many times the loop is supposed to run.

        /*for (int i = 8; i < 15; i++) {
         if (i > 9) {
        System.out.println(i + "is greater then 9.");
         }
        }*/
// Task
        // Write a program using a loop that prints out 'even' when an even
        // number is encountered between 1 - 50 and 'odd' when an odd number
        // is encountered as well

        /*for (int x = 1; x<50;x++) {
        if (x % 2 == 0) {
        System.out.println(x + " is even");
        } else {
        System.out.println(x + " is odd");
          }
        } */
// Task
        // Write a program using a while loop that will print out all the
        // multiples of 4 between 1 and 50.

        /*int number = 1;
        while (number<50){
            if (number%4==0){
                 System.out.println(number);
         }
            number++;
        }*/

        // Unary Operators:
        // pre-incrementation operator -- e.g ++counter, the value is incremented before it is read.
        // post-incrementation operator -- e.g counter++, the value is read before it is incremented.

// Task
        // Write a program that print numbers 1 - 50.
        // and if a number is divisible by 3 then replace
        // that number with the word 'Fizz'
        // and if a number is divisible by 7 then replace
        // that number with the word 'Buzz'
        // and if the number is divisible by both  3 and 7 then replace
        // that number with the word 'FizzBuzz'
        // else just print the number.

        /*for (int x = 1; x<=50;x++) {
            if (x % 3 == 0 && x%7==0) {
                System.out.println("FizzBuzz");
            }
            else if (x%3==0){
                System.out.println("Fizz");
            }
            else if (x%7==0){
                System.out.println("Buzz");
            } else {
                System.out.println(x);
            }
        }*/

        // continue - used to skip an iteration (one movement loop)
        // break - stop the loop immediately
        // return - typically

        /*for (int i = 2; i < 20; i++) {
            if (i % 2 != 0) {
                return;
            }
            System.out.println(i);
        }*/

    }
}
