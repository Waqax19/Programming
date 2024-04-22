package CaseStudies;

import java.util.Scanner;

public class Vowels
{
    public static void main(String[] args)
    {
        int number = (int) (Math.random() * 100);

        Scanner userInput = new Scanner(System.in);

        System.out.println("Guess a magic number between 0 and 100");

       int guess = -1;

        while (guess != number)
        {

            System.out.println("\nEnter your guess");
            guess = userInput.nextInt();

            if (guess == number)
            {
                System.out.println("yes , the number is : " + number);
            }
            else if (guess > number)
            {
                System.out.println("Your guess is too high");
            } else
            {
                System.out.println("Your guess is too low");
            }
        }
    }
}