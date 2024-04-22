package Inheritance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListLooping
{
    public static void main(String[] args)
    {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("David");
        myList.add("Ali");
        myList.add("Ahmed");
        myList.add("Qasim");
        myList.add("Michael");

        System.out.println("Traversing with the help of list iterator ");

        ListIterator<String> listIterator = myList.listIterator(myList.size());

        while (listIterator.hasPrevious())
        {
            String str = listIterator.previous();

            System.out.println(str);
        }

        System.out.println("Traversing using for loop ");

        for (int i = 0; i < myList.size(); i++)
        {
            System.out.println(myList.get(i));
        }


        System.out.println("Traversing in the list using forEach() method..s");

        myList.forEach(a->
        {
            //lambda expression
            System.out.println(a);
        });


        System.out.println("Traverse through the list using forEachRemaining() method...");

        Iterator<String> iterator = myList.iterator();

        iterator.forEachRemaining(a->
        {
            System.out.println(a);
        });






    }
}
