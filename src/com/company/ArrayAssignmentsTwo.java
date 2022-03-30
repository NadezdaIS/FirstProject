package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayAssignmentsTwo {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
// Task
        // You're given a string of words from the user. You need to find the word "Nemo", and return a string like
        // this: "I found Nemo at [the order of the word you find Nemo]!". If you can't find Nemo,
        // return "I can't find Nemo :(".

        // Receive input from the user.

        /*System.out.print("Please enter a string: ");
        String userInput = scanner.nextLine();

        // Break the string up into words.

        String[] wordArray = userInput.split(" ");

        // Loop through and find the position of the word 'Nemo'
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].equalsIgnoreCase("Nemo")) {
                System.out.println("I found Nemo at word number " + (i + 1) + "!");
                break;
            }
            if (i == wordArray.length - 1 && !wordArray[i].equalsIgnoreCase("Nemo")) {
                System.out.println("I can't find Nemo :(");
            }
        }*/


// Task
        //Create a program that takes an array and returns the difference between the biggest and smallest numbers.

     /* System.out.print("How many numbers do you want to enter?: ");
        int[] numbers = new int[scanner.nextInt()];

        // Populate the array with data.
        for (int i = 0; i < numbers.length; i++) {
            // Prompt the user to enter a number;
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        // This is to ensure that our minimum and maximum correlates with our
        // existing dataset
        int minimum = numbers[0];
        int maximum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(maximum < numbers[i]) maximum = numbers[i];
            if (minimum > numbers[i]) minimum = numbers[i];
        }
        System.out.println( Arrays.toString(numbers) + " difference between min and max number: " + (maximum - minimum));
     */

// Task 3
        //Create a program that takes an array of Strings (You can intialize the variable without user input) and checks
        // if the last item matches the rest of the array concatenated together.
        // For example,  ["i", "love", "tesh", "ilovetesh"] will return true

        /*String[] stringArr = {"i", "love", "tesh", "alot", "ilovetesh"};
        String appender = "";

        for (int i = 0; i < stringArr.length - 1; i++) {
            appender += stringArr[i];
        }

//         Ternary operator
//         Ternary operator is a conditional that can be used to decide execution
//         flow on the fly
                                    //         condition                       // true    // false
        System.out.println(appender.equals(stringArr[stringArr.length - 1]) ? "match" : "don't match");*/

        // Can be used to write a shorter version of if/else statement:
        // System.out.println (5 > 8 ? "less" : "greater");

        // Can also be used to decide the value of the variable:

        //int number = 5 > 8 ? 5 : 8;
        //System.out.println(number);


//Task
        // Write a Java program to rearrange the following array of unique elements such that each second integer is greater than
        // the integers to it's left and right.
        // Use this Array ->  {3, 5, 9, 10, 7, 2, 1}
        // {1, 3, 2, 10, 5, 10, 9}


       /* int[] numbers = {3, 5, 9, 10, 7, 2, 1};

        // Loop through the numbers array starting from the second element
        for (int i = 1; i < numbers.length; i += 2) {
            // Check the number preceding every second element
            if (numbers[i - 1] > numbers[i]) { // If number on the left is bigger then current/every second number
                // We should swap those numbers:
                int temp = numbers[i-1]; // set temporary variable it to the preceding number
                numbers[i-1] = numbers[i]; // set the preceding value to the current value
                numbers[i] = temp; // revive the temp value
            }

            // check  for the right side
            if (i + 1 < numbers.length && numbers[i + 1] > numbers[i]) { // first statement checks do it does not go out og the loop, can be deleted, always true in this case
                int temp = numbers[i+1]; // set it to the preceding number
                numbers[i+1] = numbers[i]; // set the preceding value to the current value
                numbers[i] = temp; // revive the temp value
            }
        }

        // output
        System.out.println("The resulting or rearranged array is: " + Arrays.toString(numbers));*/






    }
}



