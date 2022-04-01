package com.company;

public class MethodsAndRecursion {
    public static void main(String[] args) {

        // Recursion
        // Recursion is a phenomenon where a method calls itself.
        // a base case is the condition under which you want a recursive operation
        // to end.


        // Factorial of a number is the multiplcation of that number by all the positive
        // integers between 1 and the number.
        // The only exception being 0! -> 1, 1! -> 1
        // An example -> 5! -> 5 x 4 x 3 x 2 x 1 -> 120;

//       Calling a method to return a factorial.
//       System.out.println(factorial(5));

//       Calling a method to return a length od string.
       System.out.println(lengthOfString("Hello"));


    }

 //   Method to return a factorial.

//    Using iteration(loops)
//    public static int factorial(int number) {
//        int result = 1;
//        for (int i = 2; i <= number; i++) {
//            result *= i; // multiply all the numbers between 1 and number.
//        }
//        return result;
//      }

// Using recursion
//        public static int factorial(int n) {
//            if (n == 0 || n == 1) { //
//                return 1;
//            }
//            return n * factorial(n - 1);
//        }
            // 5 * factorial(5 -1)
            // 4 * factorial (4 - 1)
            // 3 * factorial (3 - 1)
            // 2 * factorial (2 -1 )
            //  1


// A method that returns the length of a string

        public static int lengthOfString(String value) {
            if (value.equals("")) {
                return 0;
            }

            return lengthOfString(value.substring(1)) + 1;
        }



    }

