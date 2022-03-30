package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class MethodsThree {

    // Write a method that accepts three parameters, double smallNumber, double bigNumber, String operator
    // Based on the arithmetic operator passed, perform one of the following operations: +, -, /, *
    // on the small and Big number and return the result. The return should be a double.
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println ("Please enter smaller number: ");
        String First = scanner.next();
        double smallNumber = Double.parseDouble(First);
        System.out.println ("Please enter bigger number: ");
        String Second = scanner.next();
        double bigNumber = Double.parseDouble(Second);
        System.out.println ("Please enter operator: ");
        String operator = scanner.next();
        double result = 0;
        switch (operator) {
            case "+":
                result = addition(smallNumber, bigNumber);
                break;
            case "-":
                result = subtraction(smallNumber, bigNumber);
                break;
            case "*":
                result = multiplying(smallNumber, bigNumber);
                break;
            case "/":
                result = division(smallNumber, bigNumber);
                break;
            default:
                System.out.println("Operator is not valid");
                break;
        }

        System.out.println ("The result is " + result);
    }


    public static double addition (double smallNumber, double bigNumber) {
        return smallNumber + bigNumber;
        }

    public static double subtraction(double smallNumber, double bigNumber) {
        return smallNumber- bigNumber;
        }

    public static double multiplying (double smallNumber, double bigNumber) {
        return smallNumber * bigNumber;
        }

    public static double division (double smallNumber, double bigNumber) {
        return smallNumber / bigNumber;
        }




    }

