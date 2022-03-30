package com.company;

public class StringAssignment {
    public static void main(String[] args) {
//Task
       // Write a program to compare two strings by their length and return output that tells the user if the strings are equal or not.

       /*String first = "My name is";
       String second = "Coding";
       if (first.length() != second.length()) {
       System.out.println("Strings are not equal");
       } else {
       System.out.println("Strings are equal");
       }*/

// Task
        // Write a program to add as many 'r's to 'burp' by using a variable to regulate. For example, if that variable is set to 4, then it will return an output like 'burrrrp'.
        // Option 1
        /*String firstWord = "burp";
        char r = 'r';
        int count = 4;
        int i = firstWord.indexOf(r);
        String partOne = firstWord.substring(0, (i));
        String partTwo = firstWord.substring(i, (i + 1));
        String partThree = firstWord.substring(i + 1);
        System.out.println(partOne + partTwo.repeat(count) + partThree);*/

        //Option 2
        /*String rString = ""; // This is going to contain the r's
        int rNumber = 6;
        for (int i = 0; i < rNumber; i++) {
            rString += "r"; // rString = rString + "r"; // append r's to the rString.
        }

        System.out.println("bu" + rString + "p");*/

// Task
        // Write a program to remove the first and last letters of a string. e.g. hello becomes ell.
        // Option 1
        /*String word = "Hello";
        String beginning = word.substring(0, 1);
        String end = word.substring((word.length() - 1));
        String resultOne = word.replace(beginning, "");
        System.out.println(resultOne.replace(end, ""));*/

        //Option 2
        /*String word = "coconut";
        System.out.println(word.substring(1, word.length() - 1));*/

// Task
        // Write a program to reverse a string and capitalize all the letters. e.g. hello becomes OLLEH.
        // Option 1
        /*String toReverse = "Hello";
        String capitalized = toReverse.toUpperCase();
        System.out.println(new StringBuilder(capitalized).reverse().toString());*/

        //Option 2
        /*String word = "cocomelon";
        String reversedString = "";
        for (int i = word.length() - 1; i > -1; i--) { // loop from the last character to the first
            reversedString += word.charAt(i); // append the characters in reverse to the empty string
        }
        System.out.println(reversedString.toUpperCase());*/
    }
}
