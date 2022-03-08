package Generics;

import java.util.Arrays;
import java.util.List;

public class UpperBoundGenerics
{
    public static void main(String[] args)
    {
        List<Integer> intlist = Arrays.asList(10,20,30,40);

        printAny(intlist);

        List<Double> doubleList = Arrays.asList(10.45,25.21,32.74);

        printAny(doubleList);

    }

    private static void printAny(List< ? > myList)
    {
        System.out.println(myList);
    }
}
