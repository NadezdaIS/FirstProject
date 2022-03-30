package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class ArraysClassAssignments {
    public static void main(String[] args) {
//Task
        // Ask the user to enter a range of numbers and sort that group of numbers in such a way that even numbers
        // come first in the output and odd numbers are after the even numbers.
        // The sorted version is [2, 4, 8, 10, 5, 9, 7, 3]
        // Option 1 (works, but changes order of numbers)
        Scanner scanner = new Scanner(System.in);
        /*System.out.print("How many numbers do you want to enter?: ");
        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] *= -1;
            }
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] *= -1;
            }
        }

        System.out.println("Sorted numbers: "+ Arrays.toString(numbers));*/

        //Option 2
        /*System.out.print("Please enter the number of integers you want to use: ");
        int intNumber = scanner.nextInt();
        int[] userArr = new int[intNumber];
        for (int i = 0; i < userArr.length; i++) {
            System.out.print("Enter a number: ");
            userArr[i] = scanner.nextInt();
        }
        int[] sortedArr = new int[userArr.length];
        int countEven = 0;
        for (int i = 0; i < userArr.length; i++) {
            if (userArr[i] % 2 == 0){
                countEven++;
                sortedArr[countEven - 1] = userArr[i];
            }
        }

        int countOdd = 0;
        for (int i = 0; i < userArr.length; i++) {
            if (userArr[i] % 2 != 0){
                countOdd++;
                sortedArr[countEven - 1 + countOdd] = userArr[i];
            }
        }
          System.out.println("Sorted array is: " + Arrays.toString(sortedArr));*/
        //Option 3
        //separate the even numbers and odd numbers in one for loop
        //create counter to count the odd and the even numbers entered
        /*System.out.print("Please enter the number of integers you want to use: ");
        int intNumber = scanner.nextInt();
        int[] userArr = new int[intNumber];
        int countOdd = 0;
        int countEven = 0;
        for (int i = 0; i < userArr.length; i++) {
            System.out.print("Enter a number: ");
            userArr[i] = scanner.nextInt();
            if (userArr[i] % 2 == 0) countEven++;
            else countOdd++;
        }
        int[] sortedArr = new int[userArr.length];

        int counterEven = 0;
        int counterOdd = 0;
        for (int i = 0; i < userArr.length; i++) {
            if (userArr[i] % 2 == 0){
                counterEven++;
                sortedArr[counterEven - 1] = userArr[i];

            }else {
                counterOdd++;
                sortedArr[countEven - 1 + counterOdd] = userArr[i];
            }
        }

        System.out.println("Sorted array is: " + Arrays.toString(sortedArr));*/
        //Option 4
        // Prompt the user to enter how many numbers
        /*System.out.print("How many numbers?: ");
        int[] numbers = new int[scanner.nextInt()];

        // Populate the array with data.
        for (int i = 0; i < numbers.length; i++) {
            // Prompt the user to enter a number;
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        int counter = 0;
        // Check for the odd numbers and continuously count them.
        while (counter < numbers.length && numbers[counter] % 2 == 0) counter++;

        for (int i = counter + 1; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                int temporary = numbers[counter];
                numbers[counter] = numbers[i];
                numbers[i] = temporary;
                counter++;
            }
        }

        System.out.println(Arrays.toString(numbers));*/


//Task
        //Write a program to return the second largest number from a stream of inputted integers
        //from the user.


        // Prompt the user to enter how many numbers
        /*System.out.print("How many numbers?: ");
        int[] numbers = new int[scanner.nextInt()];

        // Populate the array with data.
        for (int i = 0; i < numbers.length; i++) {
            // Prompt the user to enter a number;
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        // Sort the array.
        Arrays.sort(numbers);

        System.out.println("The second largest number is " + numbers[numbers.length - 2]);*/


//Task
        // Write a program to find out if in a list of numbers entered by a user
        // there are no multiples of 3.

        // Option 1
        /*System.out.print("How many numbers do you want to enter?: ");
        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0) {
                counter++;
            }
        }
        if (counter < 1) {
            System.out.println("There are no multiples of 3.");
        } else {
            System.out.println("There are " + counter + " multiples of 3.");*/

        //Option 2
        // Prompt the user to enter how many numbers
        /*System.out.print("How many numbers?: ");
        int[] numbers = new int[scanner.nextInt()];

        // Populate the array with data.
        for (int i = 0; i < numbers.length; i++) {
            // Prompt the user to enter a number;
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        boolean ifThree = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0) {
                ifThree = true;
                break;
            }
        }
        if (ifThree) {
            System.out.println("A multiple of three exists");
        } else {
            System.out.println("No multiple of three exists");
        }*/



    }
}

