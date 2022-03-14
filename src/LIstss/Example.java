package LIstss;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
/*
        List<MyBook> list2 = new ArrayList<MyBook>();

        List<String> list3 = new LinkedList<String>();*/

        list.add("Mangoes");
        list.add("Bnana");
        list.add("Strawberry");
        list.add("Grapes");

        for (String fruits : list)
        {
            System.out.println(fruits);
        }
    }
}
