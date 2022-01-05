package Selections;

import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the year ");

        int year = userInput.nextInt();
        //A year is a leap year if it is divisible by 4 but not by 100, or if it is divisible by 400.
        //check if it's a leap year
       /*boolean isLeapYear = (year % 4 == 0);

       //it is divisible by 4 but not by 100

        isLeapYear = isLeapYear && (year % 100 != 0);

        isLeapYear = isLeapYear || (year % 400 ==0);*/

        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);

        System.out.println(year + " is a leap year ? " + isLeapYear);




    }
}
