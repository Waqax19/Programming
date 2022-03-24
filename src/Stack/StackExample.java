package Stack;

import java.util.Iterator;
import java.util.Stack;

public class StackExample
{
    public static void main(String[] args)
    {
        Stack<Integer> myStack = new Stack<>();

        boolean result = myStack.empty();

        System.out.println("Is stack empty ? " + result);//true

        myStack.push(58);
        myStack.push(12);
        myStack.push(47);
        myStack.push(98);

        System.out.println("Element removed " + myStack.pop());

        System.out.println("Elements in Stack : " + myStack);

        System.out.println(myStack.peek());

        //searching for location

        System.out.println("Stack : " + myStack);

        System.out.println("Location of 47 : " + myStack.search(47));

        System.out.println("The stack size is : " + myStack.size());

        result = myStack.empty();

        System.out.println("Is stack empty ? " + result);

        Iterator iterator = myStack.iterator();

        while (iterator.hasNext())
        {
            Object values = iterator.next();

            System.out.println(values);
        }

    }

}
