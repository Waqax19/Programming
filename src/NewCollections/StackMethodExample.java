package NewCollections;

import java.util.Stack;

public class StackMethodExample
{
    public static void main(String[] args)
    {
        Stack<Integer> myStack = new Stack<>();

        boolean result = myStack.empty();

        System.out.println("Is stack empty " + result);


        myStack.push(48);
        myStack.push(97);
        myStack.push(82);
        myStack.push(16);
        //LIFO
        System.out.println("Elements on stack : " + myStack);

        System.out.println("Searching for 97 " + myStack.search(97));

        int location = myStack.search(97);
        System.out.println("search location is " + location);

        System.out.println("Element on top is " + myStack.peek());

        myStack.pop();

        System.out.println("Element removed and new stack is : " + myStack);

        result = myStack.empty();

        System.out.println("Is stack empty ? " + result);

    }
}
