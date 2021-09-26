package Arrayss;

import java.util.Scanner;

public class FindMin
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter 10 numbers ");

        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = userInput.nextDouble();
        }

        System.out.println("The minimum number is : " + min(numbers));
    }


    public static double min(double[] array)
    {
        double myMinArray = array[0];

        for (double i : array)
        {
            if(i < myMinArray)
            {
                myMinArray = i;
            }
        }

        return myMinArray;
    }

}
