package PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PQueue
{
    public static void main(String[] args)
    {
        //create a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.add(4);
        numbers.add(2);
        numbers.add(1);

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
            System.out.println();
        }



       /* boolean result = numbers.remove(2);

        System.out.println("Is 2 removed ? " + result );

        System.out.println("Priority Queue : " + numbers);

        int num = numbers.peek();

        System.out.println("Accessed element :  " + num);*/

    }
}
