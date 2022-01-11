package Functions;

import java.util.Scanner;

public class PalIntRev
{
   //pass by value
   //The pass by value method copies the value of actual parameters.
    // The called function creates its own copy of argument values and then uses them.
    // Since the work is done on a copy, the original parameter does not see the changes.


    public static void swapping(int num1, int num2)
    {
        System.out.println("\tInside swap method ");
        System.out.println("        Before Swapping , num1 is : " + num1 + " and num2 is : "+ num2);
        //swap numbers
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("        After Swapping , num1 is : " + num1 + " and num2 is : "+ num2);
    }

    public static void main(String[] args)
    {
        int num1 = 1;

        int num2 = 2;

        System.out.println("Before invoking swap method, num1 is : " + num1 + " and num2 is : " + num2);

        swapping(num1, num2);

        System.out.println("After invoking swap method, num1 is : " + num1 + " and num2 is : " + num2);

    }
}