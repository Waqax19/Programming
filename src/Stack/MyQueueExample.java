package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueueExample
{
    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(6);
        queue.add(1);
        queue.add(8);
        queue.add(14);
        queue.add(7);

        System.out.println("The queue is : " + queue);

        int numb1 = queue.remove();

        System.out.println("The queue after deletion is : " + numb1);


        int head = queue.peek();

        System.out.println("The head of the queue is : " + head);

        int size = queue.size();

        System.out.println("The size of the queue is : " + size);

    }
}
