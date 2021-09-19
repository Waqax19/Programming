package Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeueExample
{
    public static void main(String[] args)
    {
        Deque<String> dq = new LinkedList<>();

        //add element at the tail (end) of the dequeue

        dq.offer("ABC");
        dq.offer("DEF");
        dq.offer("GHI");
        dq.offer("JKL");
        dq.offer("MNO");

        System.out.println("Elements in the dedequeue : " + dq);

        System.out.println("Head element of the dequeue(getFirst()) : " + dq.getFirst());


        System.out.println("Elements in the dedequeue : " + dq);



        System.out.println("Remove element for the dequeue(removeFirst()) : " + dq.removeFirst());

        System.out.println("Element after removal : " + dq);

        dq.addFirst("XYZ");

        System.out.println("Is this element is added at the head " + dq);

        System.out.println("DeQueue removeLast() : " + dq.removeLast());

        System.out.println("Elements : " + dq);

        dq.addLast("PQR");

        System.out.println(dq);

    }
}