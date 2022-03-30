package com.company;
import java.lang.reflect.Array;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class AssignmentDates {
    public static void main(String[] args) {


// Task
        // Receive the year, month and day from the user separately.
        // - The year should be a four-digit number.
        // - Assume that the date is correct
        // Determine if the date is a magic date
        // A magic date occurs when:
        // - m * d  is a 1-digit number that matches the last digit of the year. OR
        // - m * d is a 2-digit number that matches the last 2 digits of the year. OR
        // - m * d is a 3-digit number that matches the last 3 digits of the year.

        Scanner scanner = new Scanner(System.in);

        /*System.out.print("Enter the date's day of the month: ");
        String day = scanner.nextLine();
        int dayInt = Integer.parseInt(day);
        System.out.print("Enter the date's month: ");
        String month = scanner.nextLine();
        int monthInt = Integer.parseInt(month);
        System.out.print("Enter the date's year: ");
        String year = scanner.nextLine();
        String lastOneDigit = year.substring(3);
        String lastTwoDigits = year.substring(2);
        String lastThreeDigits = year.substring(1);
        int lastOne = Integer.parseInt(lastOneDigit);
        int lastTwo = Integer.parseInt(lastTwoDigits);
        int lastThree = Integer.parseInt(lastThreeDigits);

        if (dayInt * monthInt == lastOne || dayInt * monthInt == lastTwo || dayInt * monthInt == lastThree) {
            System.out.print("The date is magic!");
        } else {
            System.out.print("The date is not magic!");
        }*/



    }
}
