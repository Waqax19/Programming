package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExample
{
    public static void main(String[] args)
    {
        Deque<Integer> numbers = new ArrayDeque<>();

        numbers.offer(1);
        numbers.offerLast(25);
        numbers.offerFirst(14);

        System.out.println("Dequeu : " + numbers);

        int firstElement = numbers.peekFirst();

        System.out.println("First element : " + firstElement);

        int lastElement = numbers.peekLast();
        System.out.println("Last Element " + lastElement);

        //remove element
        int removeNumber1 = numbers.removeFirst();
        System.out.println("Removed first element : " + removeNumber1);

        int removedLast = numbers.pollLast();
        System.out.println("Removed last element : " + removedLast);

        System.out.println("Updated Queue " + numbers);

    }
}
