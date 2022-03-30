package com.company;
import java.util.Scanner;
public class MethodsIntro {
    public static void main(String[] args) { // main method is the entry point // void means no return
        // public - accessible throughout the project
        // class - a blueprint for describing an object
        // Method is action, that is carried out on the object, list of steps to perform the action.
        // In Java any action is performed inside the method.

        // Calling Method1 that check is the number is odd or even:

        // boolean evenValue = checkEven(6); // main should ask for the same type that the method provides
        // checkEven(9); // will not five any output
        // System.out.println(checkEven(9)); // print our the result of the Method1
        // System.out.println(checkEven(9) ? "Number is Even" : "Number is Odd"); // print out result
        // using ternary operator
        // System.out.println(checkEven(numberToCheck) ? "Number is Even" : "Number is Odd") // print our result
        // if the scanner is used
// Task
        // Write a method that takes in a string and returns the number of consonants in the string.
        // Input should be from the user.
        // Calling Method2:
       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String text = scanner.nextLine();
        System.out.print("The number of consonants is " + countConsonants(text));*/

    }
        // Method1 that check is the number is odd or even
        /*public static boolean checkEven(int number) {
        if (number % 2 == 0) return true;
        else return false;
        }*/

// Method2 returns number of consonants in the word:
    public static int countConsonants(String text) { // static means method does not create new object // int return time
        /*int charCount = text.length();
        int vowelCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.toLowerCase().charAt(i);
            switch (currentLetter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
                    break;
            }
        }
        return charCount - vowelCount;*/

// Option 2, considering there could be spaces:
        int vowelCount = 0;
        int spaceCount = 0;
        char[] wordArr = text.toLowerCase().toCharArray(); // String to Char Array
        for (int i = 0; i < wordArr.length; i++) {
            char currentChar = wordArr[i];
            switch (currentChar) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
                    break;
                case ' ':
                    spaceCount++;
                    break;
            }
        }

        return text.length() - (vowelCount) - spaceCount; //  number of consonants


    }





}
