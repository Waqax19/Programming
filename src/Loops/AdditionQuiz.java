package Loops;

import java.util.Scanner;

public class AdditionQuiz
{
    public static void main(String[] args)
    {
       int data;

       int sum = 0;

       Scanner userInput = new Scanner(System.in);

       do {
           System.out.println("Enter the int, 0 to exit ");

           data = userInput.nextInt();

           sum += data;
       }while (data != 0);
        System.out.println("The sum is " + sum);

    }
}
