package Arrayss;

import java.util.Scanner;

public class CountOccurances
{
    public static void countOccur(int[] counting)
    {
        Scanner userInput = new Scanner(System.in);

        int number;// = userInput.nextInt();//

        while ((number = userInput.nextInt()) != 0)
        {
            if(number >= 1 && number <= 100)
            {
                counting[number - 1]++;
            }
        }
    }


    public static void main(String[] args)
    {
        int[] count = new int[100];

        System.out.println("Enter the number between 1 and 100 ");

        countOccur(count);

        //iterate between numbers

        for (int i = 0; i < count.length; i++)
        {
            if(count[i] > 0)
            {
                System.out.println((i + 1) + " occurs " + count[i] + " times ");
            }
        }

    }
}
