package com.company;
import java.util.Scanner;
//import java.regex.Pattern;
//import java.regex.Matcher;

public class StringExtended {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.next();
        String userSurname = scanner.next();
        System.out.println("Your full name is: " + userSurname + " " + userName);
        scanner.close()*/

//Task
        /*Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter first word: ");
        String first = scanner.next();
        System.out.println ("Enter second word: ");
        String second = scanner.next();

        if (first.length() != second.length()) {
            System.out.println("Strings are not equal");
        } else {
            System.out.println("Strings are equal");
        }*/

//Task
        /*Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter your word: ");
        String firstWord = scanner.next();
        System.out.print("Enter a number of r's: ");
        int count = scanner.nextInt();
        char r = 'r';
        int i = firstWord.indexOf(r);
        String partOne = firstWord.substring(0, (i));
        String partTwo = firstWord.substring(i, (i + 1));
        String partThree = firstWord.substring(i + 1);
        System.out.println(partOne + partTwo.repeat(count) + partThree);*/

//Task
        /*Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter your word: ");
        String word = scanner.next();
        String beginning = word.substring(0, 1);
        String end = word.substring((word.length() - 1));
        String resultOne = word.replace(beginning, "");
        System.out.println(resultOne.replace(end, ""));*/

//Task
        /*Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter your word: ");
        String toReverse = scanner.next();
        String capitalized = toReverse.toUpperCase();
        System.out.println(new StringBuilder(capitalized).reverse().toString());*/

        // Escape characters
        // Escape characters are special characters that allow us to
        // perform specials from within a string.
        // \n - this creates a new line
        // \t - this creates a new tab.
        // \r - carriage turn (does the same thing as pressing `enter`"
        // System.out.println("The little \"brown\" dog");
        // System.out.println("This is one line\nThis is a second line");

        // Wrapper Classes (converting Strings to primitive values)
        // String five = "5";
        // int number = Integer.parseInt(five);
        // System.out.println((number + number) * number);

        // String six = "6.00001";
        // oduble sixValue = Double.parseDouble(six);

        // String falseString = "false";
        // boolean falseValue = Boolean.parseBoolean(falseString);
        // System.out.println(falseValue);

        // Regex
        // Quantifiers are a construct under regex that allows us to
        // take note of the number of occurences of a particular sequence in a string.

        // + - checks if a character or sequence has at least one occurence in
        // the string. e.g a+[bc]+ -> checks if there is at least one a in the string being tested.
        // * - checks if a character appears zero or more times.
        // ? - checks if a character appears zero or one time.

        // Pattern pattern = Pattern.compile("a+[bc]+"); // Pattern checker
        // Matcher matcher = pattern.matcher("aaaaacd"); // String to check
        // Matcher matcher2 = pattern.matcher("boogieboy109"); // String to check
        // System.out.println(matcher.matches()); // This returns true if they match and false if not.
        // System.out.println(matcher2.matches()); // This returns true if they match and false if not.

//Task
        // Write a program that accepts a string from the user and returns
        // the number of vowels that can be found in that string.
        // For example: If the user enters the string, "Bodacious" -> 5
        // Caveat: Make your program interactive.

        /*Scanner scanner = new Scanner (System.in);
        System.out.println ("Please enter word or sentence: ");
        String first = scanner.nextLine().toLowerCase();
        int counterFirst = 0;
        for (int i = 0; i < first.length(); i++) {
            if ('a' == first.charAt(i) || 'o' == first.charAt(i) || 'e' == first.charAt(i)
                    || 'i' == first.charAt(i) || 'u' == first.charAt(i)) {
                counterFirst++;
            }
        }
        System.out.println("The number of vowels in your word or sentence " + counterFirst);*/

//Task
        //Option 1
        // Write a program that accepts 5 numbers from a user AS STRINGS.
        // DO NOT USE THE nextInt() method.
        // Add the first two numbers and subtract the second two numbers and
        // multiply the result of the calculation above, then
        // divide the result by the last number and print interactively.

        /*Scanner scanner = new Scanner (System.in);
        System.out.println ("Please enter first number: ");
        String first = scanner.next();
        System.out.println ("Please enter second number: ");
        String second = scanner.next();
        System.out.println ("Please enter third number: ");
        String third = scanner.next();
        System.out.println ("Please enter fourth number: ");
        String fourth = scanner.next();
        System.out.println ("Please enter fifth number: ");
        String fifth = scanner.next();
        System.out.println("Your result is: " + (Float.valueOf(first)+Float.valueOf(second))*(Float.valueOf(third)
        -Float.valueOf(fourth))/Float.valueOf(fifth));*/

        //Option 2 using Switch
        // Prompt the user for a string
        /*Scanner scanner = new Scanner (System.in);
        System.out.print("Please enter a string: ");
        String inputString = scanner.nextLine();

        //initialize a counter variable to count the vowel occurrences.
        int counter = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char currentLetter = inputString.toLowerCase().charAt(i); // The current letter we are checking.
            switch (currentLetter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;
//                default:
//                    System.out.println("Not a vowel");
//                    break;
            }
        }

        System.out.println("The number of vowels in the string is: " + counter);*/

//Task
        // Simple calculator, but interactive and using switch

        /*Scanner scanner = new Scanner (System.in);
        System.out.println ("Please enter first number: ");
        String First = scanner.next();
        System.out.println ("Please enter second number: ");
        String Second = scanner.next();
        System.out.println ("Please enter operator: ");
        String Operator = scanner.next();
        float firstNumber = Float.parseFloat(First);
        float secondNumber = Float.parseFloat(Second);
        switch (Operator) {
            case "+":
                System.out.println("Answer is " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println("Answer is " + (firstNumber - secondNumber));
                break;
            case "*":
                System.out.println("Answer is " + (firstNumber * secondNumber));
                break;
            case "/":
                System.out.println("Answer is " + (firstNumber / secondNumber));
                break;
            default:
                System.out.println("Not a valid operator");
                break;
        }*/

    }
}
