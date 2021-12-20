package Arrayss;

import java.util.Scanner;

public class AnalyzeArrays
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the number of items ");

        int num = userInput.nextInt();

        double[] numbers = new double[num];

        double sum = 0;

        System.out.println("ُEnter the numbers ");

        for (int i = 0; i < num; i++)
        {
            numbers[i] = userInput.nextDouble();

            sum += numbers[i];
        }


        double average = sum / num;

        int count = 0;

        for (int i = 0; i < num; i++)
        {
            if(numbers[i] > average)
            {
                count++;
            }

        }

        System.out.println("Average is : " + average);

        System.out.println("Number of elements above the average is : " + count);

    }
}
