package Recursion;

import java.util.Random;
import java.util.Scanner;

public class ArrIntro
{
    public static void main(String[] args)
    {

        int max;



        int a[] = new int[]{25,4,15,355,154,21,205,87,54,65,98};

        max = a[0];

        for (int i = 0; i < a.length; i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }

        //for (int i = 0; i  < number; i++)


        System.out.println("The largest element in the array is : " + max);
    }
}