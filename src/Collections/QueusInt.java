package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueusInt
{
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();

        boolean isQueueEmpty = q.isEmpty();

        System.out.println("Is queue empty ? " + isQueueEmpty);

        System.out.println("q.peek() : " + q.peek());//null exception

        System.out.println("q.poll() : " + q.poll());


        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);

        System.out.println("Size of the queue is : " + q.size());


        System.out.println("Original elements in the queue : " + q);


        int head = q.remove();


        System.out.println("Remove element at the head of the queue " + head);

        System.out.println("Elements in the queue : " + q);

        int peek = q.peek();

        System.out.println("Head element in the queue : " + peek);

        System.out.println("Element in the queue : " + q);





    }
}
