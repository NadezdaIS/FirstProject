package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayAssignment {
    public static void main(String[] args) {
//Task
        // Write a program that receives some numbers based on the user’s
        // choice and then returns the largest number of the ones the user entered.
        Scanner scanner = new Scanner(System.in);
        /*System.out.print("How many numbers do you want to enter?: ");
        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }
        int max = numbers [0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) { // If current is bigger than first, current becomes next maximum
                max = numbers[i];
            }
        }
        System.out.println("The biggest of the numbers is "+ max);*/
//Task
        // Write a program that accepts a String from the user and returns an array
        // of integers representing the counts of each vowel in the String.
        // The array returned by your method should hold 5 elements:
        // the first is the count of As, the second is the count of Es, the third Is, the fourth Os, and the fifth Us.

        //Option 1
        /*System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        int counterA = 0;
        int counterE = 0;
        int counterI = 0;
        int counterO = 0;
        int counterU = 0;
        for (int i = 0; i < userInput.length(); i++) {
            char currentLetter = userInput.toLowerCase().charAt(i);
            switch (currentLetter) {
                case 'a':
                    counterA++;
                    break;
                case 'e':
                    counterE++;
                    break;
                case 'i':
                    counterI++;
                    break;
                case 'o':
                    counterU++;
                    break;
                case 'u':
                    counterO++;
                    break;
            }
        }
        int[] numbers = {counterA, counterE, counterI, counterO, counterU};

        System.out.print("The number of A, E, I, O and U in your string accordingly: " + Arrays.toString(numbers));*/

        //Option 2
        /*
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        // We know that the array is going to have a length of 5
        int[] vowelCount = new int[5];
        // Loop through the string and count the vowels
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.toLowerCase().charAt(i);
            switch (currentLetter) {
                case 'a':
                    vowelCount[0]++;
                    break;
                case 'e':
                    vowelCount[1]++;
                    break;
                case 'i':
                    vowelCount[2]++;
                    break;
                case 'o':
                    vowelCount[3]++;
                    break;
                case 'u':
                    vowelCount[4]++;
                    break;
            }
        }
        // Output to the console.
        System.out.println("The vowel breakdown for " + text + " is " + Arrays.toString(vowelCount));*/

    }
}