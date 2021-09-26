package Arrayss;

import java.util.Scanner;

public class IndexOfSmallestInteger
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


        System.out.println("The min number is : " + numbers[indexOfSmallestElement(numbers)] + "\n");

        System.out.println("The smallest number index is : " + indexOfSmallestElement(numbers));
    }


    public static int indexOfSmallestElement(double[] array)
    {
        double myMinArray = array[0];

        int minIndex = 0;

        for (int i = 1; i < array.length; i++)
        {
            if(array[i] < myMinArray)
            {
                minIndex = i;
            }

        }

        return minIndex;
    }
}
