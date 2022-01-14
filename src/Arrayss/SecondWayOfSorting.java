package Arrayss;

import java.util.Scanner;

public class SecondWayOfSorting
{
    public static void main(String[] args)
    {
        int size , i , temp;

        int myArray[] = new int[50];

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter array size ");

        size = userInput.nextInt();


        System.out.println("Enter array elements ");

        for (i = 0; i < size; i++)
        {
            myArray[i] = userInput.nextInt();
        }

        System.out.println("Sorting the array .....");

        for (i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (myArray[i] > myArray[j])
                {
                    temp = myArray[i];

                    myArray[i] = myArray[j];

                    myArray[j] = temp;
                }
            }
        }


        System.out.println("Now array after sorting ... ");

        for (i = 0; i < size ; i++)
        {
            System.out.println(myArray[i] + " ");
        }
    }
}