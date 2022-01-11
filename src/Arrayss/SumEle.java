package Arrayss;

import java.util.Scanner;

public class SumEle
{
    public static void main(String[] args)
    {

       /* int arr[] = {10,20,30,40,50,60,70,80,90};

        int size = arr.length;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > m)
        }*/



















        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter required size of the array ");

        int size = userInput.nextInt();

        int myArr[] = new int[size];

        int sum = 0;

        System.out.println("Enter elements one by one ");

        for (int i = 0; i < size; i++)
        {
            myArr[i] = userInput.nextInt();

            sum = sum + myArr[i];
        }


        System.out.println("Sum of elements of the array is " + sum);
    }
}
