package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class MethodsThree {

    // Write a method that accepts three parameters, double smallNumber, double bigNumber, String operator
    // Based on the arithmetic operator passed, perform one of the following operations: +, -, /, *
    // on the small and Big number and return the result. The return should be a double.

    public static void main(String[] args) {
        // Calling Option 1
        Scanner scanner = new Scanner (System.in);
        /*System.out.println ("Please enter smaller number: ");
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

        System.out.println ("The result is " + result);*/

        // Calling Option 2
        System.out.print("Enter the small number: ");
        double smallN = scanner.nextDouble();

        System.out.print("Enter the big number: ");
        double bigN = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, /, *): ");
        String operator = scanner.next();


        System.out.println("The result is: " + miniCalc(smallN, bigN, operator));

    }

    // Option 1
    /*public static double addition (double smallNumber, double bigNumber) {
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
        }*/

    // Option 2
    public static double miniCalc(double smallNumber, double bigNumber, String operator) {

        switch (operator) {
            case "+":
                return smallNumber + bigNumber;
            case "-":
                return bigNumber - smallNumber;
            case "*":
                return bigNumber * smallNumber;
            case "/":
                return bigNumber / smallNumber;
            default:
                System.out.println(operator + " operator is not a valid option");
                return 0;
        }


    }

}

