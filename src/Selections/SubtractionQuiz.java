package Selections;

import java.util.Scanner;

public class SubtractionQuiz
{
    public static void main(String[] args)
    {
        int number1 = (int) (Math.random() * 10);//generate random numbers from  0 to 10 -> 7

        int number2 = (int) (Math.random() * 10); // 15

        //swapping the numbers

        if(number1 < number2)
        {
            //we will swap the numebers with the help of temp variable

            int tempVar = number1;//7
            number1 = number2;//15 number1 becomes 15
            number2 = tempVar;//number2 is now 7

        }

        Scanner userInput = new Scanner(System.in);

        //prompt the message to user
        System.out.println("What is " + number1 +" - " + number2 + " ?");

        int answer = userInput.nextInt();

        if(number1 - number2 == answer)
        {
            System.out.println("yes you are correct .. ");
        }


        else
        {
            System.out.println("Your answer is wrong ");

            System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
        }
    }
}