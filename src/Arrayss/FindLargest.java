package Arrayss;

import java.util.Scanner;

public class FindLargest
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        int number, max;

        System.out.println("Enter the number of elements in the array ");

        number = userInput.nextInt();

        int array[] = new int[number];

        System.out.println("Enter the elements of the array ");

        for (int i = 0; i < number; i++)
        {
            array[i] = userInput.nextInt();


        }

        max = array[0];

        for (int i = 0; i < number; i++)
        {
            if (max < array[i])
            {
                max = array[i];
            }
        }

        System.out.println("Maximum Value in the array is : " + max);

    }
}