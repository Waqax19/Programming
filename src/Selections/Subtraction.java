package Selections;

import java.util.Scanner;

public class Subtraction
{
    /*
        1. Generate two single-digit integers into number1 and number2.
        2. If number1 < number2, swap number1 with number2.
        3. Prompt the student to answer, "What is number1 – number2?"
        4. Check the student’s answer and display whether the answer is correct.
     */

    public static void main(String[] args)
    {


        int number1 = (int) (Math.random() * 10);//2

        int number2 = (int) (Math.random() * 10);//4

        //swap the numbers
        if(number1 < number2)
        {
            int temp = number1;

            number1 = number2;

            number2 = temp;
        }


        //prompt the message to the user
        System.out.println("What is " + number1 + " - " + number2 + " ?");

        Scanner userInput = new Scanner(System.in);

        int answer = userInput.nextInt();

        //grade the answer

        if(number1 - number2 == answer)
        {
            System.out.println("You are correct ");
        }

        else
        {
            System.out.println("You are incorrect ");

            System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
        }

    }
}