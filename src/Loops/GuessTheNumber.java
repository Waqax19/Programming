package Loops;

import java.util.Scanner;

public class GuessTheNumber
{
    public static void main(String[] args)
    {
        int num = (int) (Math.random() * 101);

        Scanner userInput = new Scanner(System.in);

        System.out.println("Guess the number between 0 and 100");

        int guess = -1;

        while (guess != num)
        {

            System.out.println("Enter the guess ");

             guess = userInput.nextInt();

            if (guess == num) {
                System.out.println("Yes, the number is " + num);

            } else if (guess > num) {
                System.out.println("Your guess is too high");
            } else
                System.out.println("Your guess is too low ");
        }
    }
}