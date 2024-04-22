package Functions;

import java.util.Locale;
import java.util.Scanner;

public class Doubloon
{
    /*
    Write a program that converts a temperature from Celsius to Fahrenheit.
     It should (1) prompt the user for input, (2) read a double value from the keyboard,
      (3) calculate the result, and (4) format the output to one decimal place.
      When it’s finished, it should work like this:
     */


    public static void main(String[] args)
    {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter the value of the temp..");

        double tempValue = userInput.nextDouble();

        double res = (9.0/5 * tempValue + 32);

       // System.out.println("Result is : " + String.format("%.1f", res));

        System.out.println(res);


    }
}
