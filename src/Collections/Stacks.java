package Collections;

import java.util.Stack;

public class Stacks
{
    public static void main(String[] args)
    {
        Stack<Integer> myStack = new Stack<>();

        boolean CheckEmpty = myStack.empty();

        System.out.println("is stack empty ? " + CheckEmpty);


        myStack.push(25);
        myStack.push(87);
        myStack.push(49);
        myStack.push(27);
        myStack.push(36);

        System.out.println("Elemetns in stack : " + myStack);

        myStack.pop();
        System.out.println("Elemetns in stack After pop : " + myStack);

        CheckEmpty = myStack.empty();

        System.out.println("If it is empty ? " + CheckEmpty);



    }

}
