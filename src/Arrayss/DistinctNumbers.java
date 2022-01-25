package Arrayss;

import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args)
    {
        Scanner UserInput = new Scanner(System.in);

        int number;

        int count = 0;

        int[] distinctNumber = new int[10];

        System.out.println("Enter ten Number: ");


        for (int i = 0; i <10; i++)
        {
            number = UserInput.nextInt();

            if (distinctNumbers(distinctNumber, number ))
            {
                distinctNumber[count] = number;
                count++;
            }


        }

        System.out.println("The number of distinct numebrs are : " + count);

        System.out.println("The unique numbers are : ");

        for (int i = 0; i < distinctNumber.length; i++)
        {
            if (distinctNumber[i] > 0)
            {
                System.out.println(" " + distinctNumber[i]);
            }

            System.out.println();
        }



    }


    public static boolean distinctNumbers(int[] arr, int number)
    {
        for (int i = 0; i < arr.length;i++)
        {
            if (number == arr[i])
                return false;
        }

        return true;
    }
}
