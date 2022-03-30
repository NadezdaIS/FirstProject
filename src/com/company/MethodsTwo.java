package com.company;
import java.util.Scanner;
import java.util.Arrays;


public class MethodsTwo {
    public static void main(String[] args) {

// Write a method that takes in an array of numbers and
// returns the maximum number in the array.
// it should return an int.
// N.B. Do not use the Math.max() method.
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter?: ");
        int[] userNumbers = new int[scanner.nextInt()];

        // Populate the array.
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.print("Enter a number: ");
            userNumbers[i] = scanner.nextInt();
        }

        System.out.println("The maximum value in the array is: " + findMax(userNumbers));
        }


    public static int findMax(int[] numbers) {
        // Start by initializing the maximum variable
        int maximum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (maximum < numbers[i]) { // if current number is bigger than maximum it becomes the new max
                maximum = numbers[i];
            }
        }

        return maximum;
    }
}

