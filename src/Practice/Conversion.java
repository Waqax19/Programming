package Practice;

import java.util.Scanner;

public class Conversion
{
    /*
    (Convert pounds into kilograms) Write a program that converts pounds into kilograms.
     The program prompts the user to enter a number in pounds, converts it
to kilograms, and displays the result. One pound is 0.454 kilograms. Here is a
sample run:
     */
    public static void main(String[] args)
    {

        //System.out.println("Sum of 1 + 1 = " + (1 + 1));//concat , add with the string

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number pounds:");
        double pound=in.nextDouble();

        double kilogram = pound * 0.454;


        System.out.println("Pound " + pound + " is equal to = " + kilogram);
    }
}
