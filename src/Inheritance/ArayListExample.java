package Inheritance;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArayListExample
{
    public static void main(String[] args)
    {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Pakistan");
        myList.add("Jordan");
        myList.add("Egypt");
        myList.add("Italy");
        myList.add("Albania");
        myList.add("Switzerland");
        myList.add("France");

     //   System.out.println("Element is : " + myList.get(2));

        Collections.sort(myList);
        System.out.println(myList);



        List<Integer> numbers = new ArrayList<>();

        numbers.add(25);
        numbers.add(1);
        numbers.add(5);
        numbers.add(299);

        Collections.sort(numbers);

        System.out.println(numbers);

        //System.out.println("Spain is being added.. " + myList.set(3,"Spain"));

       /* myList.set(3,"Spain");
        System.out.println("_________________________________");

        //System.out.println(myList);

        for (String countries : myList)
        {
            System.out.println(countries);
        }
*/






       /* Iterator iterator = myList.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }*/

    }
}
