package Functions;

import java.util.Scanner;

public class CalendarPrinting
{
    public static void printMonth(int year , int month)
    {
        //TODO : call printMonthTitle here
        printMonthTitle(year, month);

        //TODO : printMonthBody , call this function here
        printMonthBody(year, month);
    }

    public static void printMonthTitle(int year, int month)
    {
        System.out.println("    " + getNameOfMonth(month) + " " + year);

        System.out.println("----------------------------------");

        System.out.println(" Sun Mon Tue Wed Thu Fri Sat ");
    }

    public static String getNameOfMonth(int month)
    {
        String monthName = "";
        switch (month)
        {
            case 1:
                monthName = "January";
                break;

            case 2:
                monthName = "Feburary";
                break;

            case 3:
                monthName = "March";
                break;

            case 4:
                monthName = "April";
                break;

            case 5:
                monthName = "May";
                break;

            case 6:
                monthName = "June";
                break;

            case 7:
                monthName = "July";
                break;

            case 8:
                monthName = "August";
                break;

            case 9:
                monthName = "Septemeber";
                break;

            case 10:
                monthName = "October";
                break;

            case 11:
                monthName = "November";
                break;

            case 12:
                monthName = "December";
                break;
        }

        return monthName;
    }

    public static void printMonthBody(int year, int month)
    {
        //TODO : call startingDay function here
        int startDay = getStartDay(year , month);

        //get number of days in a month
        int numberOfDaysaMonth = getNumberOfDaysInAmonth(year, month);

        int i = 0;

        for (i = 0; i < startDay; i++)
        {
            System.out.println("    ");
        }

        for (i = 1; i <= numberOfDaysaMonth; i++)
        {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0)
            {
                System.out.println();
            }
        }

        System.out.println();
    }

    public static int getStartDay(int year, int month)
    {
        int starting_day_for_Jan_1_1800 = 3;

        int totalNumOfDays = getTotalNumOfDays(year , month);

        return (totalNumOfDays + starting_day_for_Jan_1_1800) % 7;
    }

    public static int getTotalNumOfDays(int year, int month)
    {
        int total = 0;

        for (int i = 1800; i < year; i++)
        {
            if (isLeapYear(i))
                total = total + 366;
            else
                total = total + 365;

        }

        //days from january to the month prior to the calendar month
        for (int i = 1; i < month; i++)
        {
            total = total + getNumberOfDaysInAmonth(year, i);

        }

        return total;

    }

    public static int getNumberOfDaysInAmonth(int year, int month)
    {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if(month == 2)
            return isLeapYear(year) ? 29 : 28;

        return 0;
    }

    public static boolean isLeapYear(int year)
    {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter full year ( .. 2002...)");
        int year = userInput.nextInt();

        System.out.println("Enter month number between 1 and 12 ");
        int month = userInput.nextInt();

        printMonth(year, month);



    }
}
