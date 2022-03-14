package LIstss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListToArray
{
    public static void main(String[] args)
    {
        List<String> subjects = new ArrayList<>();

        subjects.add("Statistics");

        subjects.add("Maths");

        subjects.add("Programming");

        subjects.add("Design Patterns ");


        //sorting

        Collections.sort(subjects);

        for (String i : subjects)
        {
            System.out.println(i);
        }


        //sort the numbers

        List<Integer> list2 = new ArrayList<Integer>();

        list2.add(45);
        list2.add(155);
        list2.add(12);
        list2.add(98);

        Collections.sort(list2);

        for (Integer i : list2)
        {
            System.out.println(i);
        }



       /* System.out.println("Return element : " + subjects.get(1));

        subjects.set(1,"C++");

        for (String i : subjects)
        {
            System.out.println(i);
        }*/

/*

        String[] arr = subjects.toArray(new String[subjects.size()]);

        System.out.println("Prining array : " + Arrays.toString(arr));

        System.out.println("Printing Lists : " + subjects);
*/





    }
}
