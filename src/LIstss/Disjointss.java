package LIstss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Disjointss
{
    public static void main(String[] args)
    {
        List<String> list1 = new ArrayList<String>(5);

        List<String> list2 = new ArrayList<String>(15);

        list1.add("Java");

        list1.add("C++");

        list1.add("Python");

        list2.add("Python");

        list2.add("C");

        list2.add("JavaScript");

        boolean isCommon = Collections.disjoint(list1, list2);

        System.out.println("Output : " + isCommon);



    }
}
