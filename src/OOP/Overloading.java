package OOP;

import java.util.Arrays;
import java.util.Random;

public class Overloading
{
    //passing an array to the method

    public static void swap(int n1, int n2)
    {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }


    public static void swapArray(int[] array)
    {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }

    public static void main(String[] args)
    {
        int[] a = {5,3};

        System.out.println("Before invoking swap ");
        System.out.println("Array is : {" + a[0] + " , " + a[1] + "}");

        swap(a[0],a[1]);

        System.out.println("After invoking swap ");
        System.out.println("Array is : {" + a[0] + " , " + a[1] + "}");




        System.out.println("Before invoking Array swap ");
        System.out.println("Array is : {" + a[0] + " , " + a[1] + "}");

        swapArray(a);

        System.out.println("After invoking Array Swap ");
        System.out.println("Array is : {" + a[0] + " , " + a[1] + "}");

    }


}
