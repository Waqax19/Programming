package Arrayss;

import java.util.Scanner;

public class RemoveDuplication
{
    public  static int[] eliminateDuplicates(int[] list)
    {
        int[] duplicates = new int[10];

        int j = 0;// , k = 0;

        //fill the array with 0

        for (int i = 0; i < list.length; i++ )
        {
            duplicates[i] = 0;
        }
        int count = 0;

        for (int i = 0; i < list.length; i++)
        {
            boolean dup = false;

            for (j = 0; j < count; j++)
            {
                if (list[i] == duplicates[j])
                {
                    dup = true;
                    break;
                }
            }

            if(!dup)
            {
                duplicates[count] = list[i];
                count++;
            }
        }

        int[] newArray = new int[count];

        for (int i = 0; i < count; i++)
        {
            newArray[i] = duplicates[i];
        }

        return newArray;
    }

    public static void main(String[] args)
    {
        Scanner UserInput = new Scanner(System.in);

        int[] tenNum = new int[10];

        System.out.println("Enter 10 numbers ");

        for (int i = 0; i < tenNum.length; i++)
        {
            tenNum[i] = UserInput.nextInt();
        }

        int[] newList = eliminateDuplicates(tenNum);
        System.out.println("The numbers without duplicates are : ");
        for (int i = 0; i < newList.length; i++)
        {
            System.out.println(" " + newList[i]);

        }
    }
}