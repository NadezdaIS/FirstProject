package com.company;

public class RecursionHomeAssignment {
    public static void main(String[] args) {
// Using recursion, write a method that takes a number as a parameter and
// returns the total sum between one and that number;
// upToNumber(8) -> 1 + 2 + ... + 8
//        System.out.println(upToNumber(2));

// Using recursion, write a method that asks a string as a parameter and
// returns the reverse of the string.
        System.out.println(reversedString("Hello"));

    }

//    public static int upToNumber(int n) {
//        if (n == 0) {
//            return n;
//        }
//        return n + upToNumber(n - 1);

// Shorter option:
// return n == 0 ? n : n + upToNumber(n - 1);
//    }



    public static String reversedString(String value) {
        if (value.equals("")) {
            return value;
        }
        return reversedString(value.substring(1)) + value.charAt(0);
    }

}
