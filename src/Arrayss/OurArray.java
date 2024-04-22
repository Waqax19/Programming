package Arrayss;

import java.util.Scanner;

public class OurArray
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter 10 elements ");

        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = userInput.nextDouble();
        }

        System.out.println("The minimum number is : " + minimum(numbers));
    }

    //find minimum in the array

    public static double minimum(double[] array)
    {
        double minimum = array[0];

        for (double i : array)
        {
            if (i < minimum)
            {
                minimum = i;
            }
        }

        return minimum;
    }
}