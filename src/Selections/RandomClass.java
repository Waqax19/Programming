package Selections;

import java.util.Random;
import java.util.Scanner;

public class RandomClass
{
    public static void main(String[] args)
    {
       //Leap operators
        Scanner userInput = new Scanner(System.in);

        int year = userInput.nextInt();
    //A year is a leap year if it is divisible by 4 but not by 100, or if it is divisible by 400
        boolean isLeapYear = (year % 4 == 0);

        isLeapYear = isLeapYear && (year % 100 != 0);



    }
}