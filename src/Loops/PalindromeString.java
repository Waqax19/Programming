package Loops;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PalindromeString
{

    public static void main(String[] args)
    {
        System.out.println("The grade is : ");

        System.out.println(grade(85));



    }

    public static char grade(double score)
    {
        if (score >= 90)
        {
            return 'A';
        }

        else if (score >= 70)
        {
            return 'B';
        }

        else if (score >= 60)
        {
            return 'C';
        }

        else if (score >= 50)
        {
            return 'D';
        }

        else
        {
            return 'F';
        }
    }


}
