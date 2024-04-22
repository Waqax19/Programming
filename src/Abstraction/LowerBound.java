package Abstraction;

import java.util.Arrays;
import java.util.List;

public class LowerBound
{
    public static void printOnlyIntegerClassOrSuperClass(List<?> list)
    {
        System.out.println(list);
    }

    public static void main(String[] args)
    {
        List<Integer> intList = Arrays.asList(10,20,30,40);

        printOnlyIntegerClassOrSuperClass(intList);

        List<Number> numberList = Arrays.asList(10,20,30,50);

        printOnlyIntegerClassOrSuperClass(numberList);
    }
}
