package Arrayss;

import java.util.Scanner;

public class PassingArrayToMethod
{
    public static int max(int[] array)
    {
        int max = 0;

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array)
    {
        int min = array[0];

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < min)
            {
                min = array[i];
            }
        }

        return min;
    }

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the size of the array that you want to create : ");

        int size = userInput.nextInt();

        int[] myArray = new int[size];

        System.out.println("Enter the elements of the array ");

        for (int i = 0; i < size; i++)
        {
            myArray[i] = userInput.nextInt();
        }


        System.out.println("Max value in the array is : " + max(myArray));

        System.out.println("Min value in the array is : " + min(myArray));


    }
}
