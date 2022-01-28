package Inheritance;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.management.MemoryType;
import java.util.Scanner;

public class Loopings {
    public static void main(String[] args) {

        /*
        1st : initialization
        2nd : loop continuation condition, boolean expression
        3rd : statements
        4th : increments / decrements
         */
        int number = (int) (Math.random() * 2);

        System.out.println("random number is" + number);

        Scanner userInput = new Scanner(System.in);

        System.out.println("Guess the number ...");

        int guess = 0;// = userInput.nextInt();

        while (guess != number)
        {
            System.out.println("Enter your guess ..");
            guess = userInput.nextInt();

            if (guess == number) {
                System.out.println("Yes, the number is : " + number);
            } else if (guess > number) {
                System.out.println("your guess is too high");
            } else {
                System.out.println("Your guess is too low..");
            }
        }
    }
}


