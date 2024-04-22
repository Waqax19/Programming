package Functions;

import java.util.Scanner;

public class IntrotoFunction
{

 /*   public static String printGrade(double score)
    {
        if (score >= 90)
        {
           return "A";
        }

        else if (score >=  80)
        {
            return "B";
        }

        else if(score >= 70)
        {
            return "C";
        }

        else if (score >= 60)
        {
            return "D";
        }

        else
            return "F";
    }*/


    public static void main(String[] args)
    {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your score ");
        String s = userInput.nextLine();

        char ch = s.charAt(0);

    /*
        switch (ch)
        {
            case 'A':

        }
*/
        if (ch == 'A'  ^ ch != '+')
        {
            System.out.println("Grade is " + 4.0);

        }

         if (ch == 'A' ^ ch == '+')
        {

            System.out.println("Grade is " + 3.7);
        }

         if (ch == 'B' ^ ch == '+')
        {
            System.out.println("Grade is " + 3.0);
        }

         if (s == "B-")
        {
            System.out.println("Grade is " + 3.0);
        }


        else
            System.out.println("Better luck next time ");

    }
}
