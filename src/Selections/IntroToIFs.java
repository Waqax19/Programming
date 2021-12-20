package Selections;

import java.util.Scanner;

public class IntroToIFs
{
    public static void main(String[] args)
    {
       Scanner userInput = new Scanner(System.in);

        System.out.println("Enter an integer ");

        int number = userInput.nextInt();

        if (number % 2 == 0)
        {
            System.out.println("It is an even Number ");
        }

        else
        {
            System.out.println("It is an odd number");
        }



    }
}
