package com.company;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
public class DateAndTimeClass {
    public static void main(String[] args) {
        // Date is class under the java.util
        // It contains tools for managing and manipulating dates
        // Date date = new Date();

        // deprecated means that something is no longer in use.

//        System.out.println(date.getTime());
//
//        LocalTime timeLocal = LocalTime.now();
//        System.out.println(timeLocal); // prints time now
//
//        LocalDate localdate = LocalDate.now();
//        System.out.println(localdate); // prints date now
//
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime); // prints date and time now

// Task
        // A leap year is a year with an additional day in it, because of the month of february.
        // Write a program that accepts a year from a user and tells the user if the year is a leap year or not.

        Scanner scanner = new Scanner(System.in);

        //Option 1
        /*System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeap = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;

        System.out.println(isLeap ? "Leap year" : "not leap year");*/

        //Option 2 using isLeapYear method
        /*boolean isLeap = LocalDate.of(year, Month.DECEMBER, 02).isLeapYear();
        System.out.println(isLeap ? "local leap year": "not leap");*/

        //Option 3

        /*System.out.print("Please enter the year: ");
        int year  = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                }
                else {
                    System.out.println(year + " is a not leap year");
                }
            }
            else
                System.out.println(year + " is a leap year");
        }
        else
            System.out.println(year + " is a not leap year");*/




// Task
        // Write a program that returns the number or amount of hours between two (o'clock) times entered by the user.

        /*System.out.print("Enter the start hour: ");
        String userStart = scanner.nextLine(); // 5:00 AM

        System.out.print("Enter the end hour: ");
        String userEnd = scanner.nextLine(); // 8:00 AM

        // Get the value of the hours
        int startHour = Integer.parseInt(userStart.split(":")[0]);
        int endHour = Integer.parseInt(userEnd.split(":")[0]);

        // If a time entered is in the morning assign it 12 else assign it 24
        // to make it easy to compare numerically.
        int amPmOne = userStart.split(" ")[1].equals("AM") ? 12 : 24;
        int amPmTwo = userEnd.split(" ")[1].equals("AM") ? 12 : 24;

        // subtract and find out the difference
        int difference =(endHour+amPmTwo) - (startHour+amPmOne);
        if (amPmOne < amPmTwo && startHour > endHour) difference +=12;


        System.out.println(difference == 0 ? "No time has passed." : difference + " hours");*/












    }
}
