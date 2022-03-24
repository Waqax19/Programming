package Stack;

import java.util.Iterator;
import java.util.Stack;

public class StackExample
{
    public static void main(String[] args)
    {
        Stack<Integer> myStack = new Stack<>();


        myStack.push(58);
        myStack.push(12);
        myStack.push(47);
        myStack.push(98);

        System.out.println("Iteration over the stack using forEach() method ");

      /*  for (Integer myInt : myStack)
        {
            System.out.println(myInt);
            
        }*/

        myStack.forEach(n ->
        {
            System.out.println(n);
        });
    }

}
