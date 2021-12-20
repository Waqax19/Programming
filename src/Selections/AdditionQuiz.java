package Selections;

import javax.swing.plaf.synth.SynthScrollBarUI;
import java.util.Scanner;

public class AdditionQuiz
{
    public static void main(String[] args)
    {
        //if-else-if

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your score ");

        int score = userInput.nextInt();

        if(score >= 60)
        {
            System.out.println("A");
        }

        else if(score >= 70)
        {
            System.out.println("B");
        }

        else if (score > 80)
        {
            System.out.println("C");
        }

        else
            if (score > 90)
        {
            System.out.println("D");
        }

            //intln("Good luck");

    }
}
