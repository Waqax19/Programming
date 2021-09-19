package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesExample
{
    public static void main(String[] args)
    {
        Queue<String> q = new LinkedList<>();

        //add element at the tail (end) of the queue

        q.add("ABC");
        q.add("DEF");
        q.add("GHI");
        q.add("JKL");
        q.add("MNO");

        System.out.println("Elements in the queue : " + q);

        System.out.println("Head element of the queue : " + q.element());

        System.out.println("Remove element for the queue : " + q.remove());

        System.out.println("Element after removal : " + q);

        boolean addElement = q.offer("PQR");

        System.out.println("Is this element is added at the tail of the queue ? " + addElement);

        System.out.println("Element in the queue after adding new element : " +  q);


    }
}
