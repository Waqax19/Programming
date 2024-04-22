package CaseStudies;

import java.util.Scanner;

public class Subtraction
{
    public static void main(String[] args)
    {
        //generate two random numbers

        int number1 = (int)(Math.random() * 20);//2

        int number2 = (int) (Math.random() * 20);//10

        //if number1 < number2 , swap the number1 with number2
        //swapping
        if(number1 < number2)
        {
            /*
            x = y
            y = z
             x = z
             */

            int temporary = number1;// 2 is assigned to temporary

            number1 = number2;//10 is assigned to number1

            number2 = temporary;//

        }

        System.out.println("What is : " + number1 + " - " + number2 + " ?");

        Scanner userInput = new Scanner(System.in);

        int answer = userInput.nextInt();

        if (number1 - number2 == answer)
        {
            System.out.println("You are correct!");
        }

        else
        {
            System.out.println("Your answer is wrong ");
            System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
        }




    }
}
