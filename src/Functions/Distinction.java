package Functions;

import java.util.Scanner;

public class Distinction
{

    public static void main(String[] args)
    {
        double[] a ;

        a = returnArray();

        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i] + " ");
        }
    }


    public static double[] returnArray()
    {
        double[] arr = new double[3];

        arr[0] = 7.88;

        arr[1] = 2.5;

        arr[2] = 555.789878;

        return  arr;
    }

}
