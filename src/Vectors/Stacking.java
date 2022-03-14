package Vectors;

import java.util.Stack;

public class Stacking
{
    public static void main(String[] args)
    {
        Stack<String> myObj = new Stack<>();

        myObj.push("iPhone");
        myObj.push("Samsung");
        myObj.push("Sony");
        myObj.push("Huwaeii");

        System.out.println("Stack is : " + myObj);


        String elem = myObj.pop();
        System.out.println("Removed element is : " + elem);

        System.out.println("Updated stack is : " + myObj);


        System.out.println("Peek element is : " + myObj.peek());


        int position = myObj.search("iPhone");

        System.out.println("Position is : " + position);


        boolean result = myObj.empty();

        System.out.println("Is the stack empty ?? " + result);
    }
}
