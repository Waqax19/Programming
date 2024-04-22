package Challenges;

import java.util.Scanner;

public class NineTailProblem
{
    public static void displayNineTail(int myList[][])
    {
        for (int i = 0; i < myList.length; i++)
        {
            for (int j = 0; j < myList[0].length; j++)
            {
                if (myList[i][j] == 1)
                {
                    System.out.println("T ");
                }
                else
                    System.out.println("H ");
            }
        }

        System.out.println();
    }


    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 511 ");

        int n = userInput.nextInt();

        int myList1[][] = new int[3][3];

        int newBit = 0b1;

        for (int i = 0; i < 9; i++)
        {
            int bit = (n & newBit);


            myList1[2 - i / 3][2 - i % 3] = bit;

            n = (n >> 1);
        }


        displayNineTail(myList1);

    }
}
