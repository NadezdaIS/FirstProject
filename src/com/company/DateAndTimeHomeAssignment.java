package com.company;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class DateAndTimeHomeAssignment {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

// Task
        // Write a Java program to get year and months between two dates.
        /*System.out.print("Enter the start date using format DD/MM/YYYY: ");
        // Option 1 using DateTImeFormatter
        String startDate = scanner.nextLine();
        System.out.print("Enter the end date using format DD/MM/YYYY: ");
        String endDate = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate start = LocalDate.parse(startDate, formatter);
        LocalDate end = LocalDate.parse(endDate, formatter);
        System.out.println(Period.between(start, end));*/

        //Option 2 with defined dates
        /*LocalDate today = LocalDate.now();
        LocalDate userDay = LocalDate.of(2020, Month.JUNE, 21);
        Period difference = Period.between(userDay, today);

        System.out.println("The difference between " +
                userDay + " - " +
                today + ": " +
                difference.getYears() + " years " + " and " + difference.getMonths() + " months.");
        System.out.println(difference.getDays());*/

// Task
        //Write a Java program to calculate the difference between two dates in days.
        // Option 1 using calendar

        /*Calendar cal = Calendar.getInstance();

        System.out.print("Enter the start date's day of the month: ");
        String startDay = scanner.nextLine();
        int startDayInt = Integer.parseInt(startDay);
        cal.set(Calendar.DAY_OF_MONTH, startDayInt);
        System.out.print("Enter the start date's month: ");
        String startMonth = scanner.nextLine();
        int startMonthInt = Integer.parseInt(startMonth);
        cal.set(Calendar.MONTH,startMonthInt);
        System.out.print("Enter the start date's year: ");
        String startYear= scanner.nextLine();
        int startYearInt = Integer.parseInt(startYear);
        cal.set(Calendar.YEAR, startYearInt);
        Date startDate = cal.getTime();

        System.out.print("Enter the start end date's day of the month: ");
        String endDay = scanner.nextLine();
        cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(endDay));
        System.out.print("Enter the end date's month: ");
        String endMonth = scanner.nextLine();
        cal.set(Calendar.MONTH, Integer.parseInt(endMonth));
        System.out.print("Enter the end date's year: ");
        String endYear= scanner.nextLine();
        cal.set(Calendar.YEAR, Integer.parseInt(endYear));
        Date endDate = cal.getTime();

        long difference = endDate.getTime() - startDate.getTime();

        System.out.println ("Amount of days between two dates is " + difference / 1000 / 60 / 60 / 24);*/

        // Option 2 using ChronoUnits / Gives you results in days or months etc.
        // can not give you result in years and months
        /*LocalDate userDate1 = LocalDate.of(2020, 6, 23);
        LocalDate userDate2 = LocalDate.of(2022, 3, 22);


        long numberOfDaysBetween = Math.abs(ChronoUnit.MONTHS.between(userDate1, userDate2));

        System.out.println("The difference between them in months is: " + numberOfDaysBetween);*/

    }
}

