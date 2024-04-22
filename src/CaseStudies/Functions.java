package CaseStudies;

import java.util.Scanner;

public class Functions
{
   public static char printGrade(double score)
   {
       if (score >= 90)
           return 'A';

       else if (score >= 80)
           return 'B';

       else if (score >= 70)
           return 'C';

       else if (score >= 60)
           return 'D';

       else
           return 'F';
   }

    public static void main(String[] args)
    {
        System.out.println("the grade is : " + printGrade(85.4));



        System.out.println("the grade is : " + printGrade(45.4));



    }
}
