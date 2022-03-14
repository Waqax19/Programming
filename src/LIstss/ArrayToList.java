package LIstss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList
{
    public static void main(String[] args)
    {
        String[] myArray = {"Lion", "Horse","Donkey","Dog","Zelenskyy"};

        System.out.println("Printing the array : " + Arrays.toString(myArray));

        List<String> list = new ArrayList<String>();

        for (String animals : myArray)
        {
            list.add(animals);
        }

        System.out.println("Printing the lists " + list);

    }
}
