package Abstraction;

import Searching.LinearSearch;

import java.util.Arrays;
import java.util.List;

public class UpperBound
{
    public static void main(String[] args)
    {
        //upper bounded int list
        List<Integer> intList = Arrays.asList(10,20,30,40);

        System.out.println("Total sum is : " + sumList(intList));

        //upper bounded double list
        List<Double> doubleList = Arrays.asList(10.99,20.78,24.74,36.85);
        System.out.print("Total sum is : " + sumList(doubleList));
    }

    private static double sumList(List<? extends Number> myList)
    {
        double sum = 0.0;

        for (Number iterator : myList)
        {
            sum = sum + iterator.doubleValue();
        }

        return sum;
    }
}
