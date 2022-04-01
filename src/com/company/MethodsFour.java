package com.company;

import java.util.Scanner;

public class MethodsFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Write  a method that compares two strings (that could be passwords) and returns true or false
// based on their equality.

        // Calling Method 1
//      System.out.println ("Please enter first password: ");
//      String first = scanner.next();

//      System.out.println ("Please enter second password: ");
//      String second = scanner.next();
//      System.out.println ((checkEqual(first, second) ? "Passwords are equal" : "Passwords are not equal"));

// Write a method to calculate simple interest and return it.

        // Calling Method 2
//      System.out.println ("Please enter principal amount: ");
//      double principalAmount = scanner.nextDouble();
//      System.out.println ("Please enter rate of interest in %: ");
//      double rateOfInterest = scanner.nextDouble();
//      System.out.println ("Please enter time period in years: ");
//      int timePeriod = scanner.nextInt();
//
//      System.out.println ("The simple interest is " + simpleInterest(principalAmount, rateOfInterest, timePeriod));

// Write a method that accepts an integer and returns whether that integer is
// a prime number or not.
        // Calling Method 3
        System.out.println("Please enter your number: ");
        int number = scanner.nextInt();
        System.out.println((checkPrime(number) ? "Number is prime" : "Number is not prime"));
    }

        // Method 1
//  public static boolean checkEqual(String first, String second) {
//      if (first.equals(second)) return true;
//      else return false;
//  }
    // Option 2 assuming there is correct password to compare entered password
         /*public static boolean compare(String enteredPassword) {
             // Assume actual password is helloworld
             String password = "helloworld";
             return enteredPassword.equals(password);
         }*/

    // Method 2
//  public static double simpleInterest(double principalAmount, double rateOfInterest, int timePeriod){
//      return principalAmount + (principalAmount*(rateOfInterest/100)*timePeriod);
//  }

        // Method 3
    public static boolean checkPrime(int number) {
            int counter = 0;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    counter++;
                }
            }
            if (counter == 0) {
                return true;
            }
            return false;
    }

}


