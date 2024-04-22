package Arrayss;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayEq
{
    public static int[] numbers()
    {
        int[] myArray = {5,6,7,8,9};

        return myArray;
    }
    public static void main(String[] args)
    {
        int[] a = numbers();

        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i] + " ");
        }
    }

}
