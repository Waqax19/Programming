package Loops;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.Scanner;

public class Datess
{
    public static void main(String[] args)
    {
       Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the year : ");

        int year = userInput.nextInt();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM  d , y");

        for (int month = 1; month <= 12; month++)
        {
            LocalDate date = LocalDate.of(year, Month.of(month) , 1);

            LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());

            System.out.println(formatter.format(firstDay) + " is " + firstDay.getDayOfWeek());
        }


    }
}
