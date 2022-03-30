package com.company;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class DateAndTimeExtended {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Task
        // Write a program to calculate the age of a person, considering that they (the user) only enters
        // their date of birth

        /*System.out.print("Enter your birthdate using format DD/MM/YYYY: ");
        String birthDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate birth = LocalDate.parse(birthDate, formatter);
        LocalDate today = LocalDate.now();
        Period age = Period.between(birth, today);
        System.out.println("Age is " + age.getYears());*/

// Task
        // Write a program to calculate the number of days between two specified years. (beginning of each year is
        // the input).
        /*Calendar calendar = Calendar.getInstance();
        System.out.print("Enter the start year: ");
        String startYear = scanner.nextLine();
        int yearOne = Integer.parseInt(startYear); // from String to int
        calendar.set(Calendar.YEAR, yearOne); // setting year to calendar, sets start of the year automatically
        Date start = calendar.getTime(); // time in milliseconds

        System.out.print("Enter the end year: ");
        String endYear= scanner.nextLine();
        int yearTwo = Integer.parseInt(endYear);
        calendar.set(Calendar.YEAR, yearTwo);
        Date endDate = calendar.getTime();

        long difference = endDate.getTime() - start.getTime();

        System.out.println ("Amount of days between two years is " + difference / 1000 / 60 / 60 / 24);*/

    }
}
