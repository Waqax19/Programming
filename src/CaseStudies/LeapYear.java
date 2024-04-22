package CaseStudies;

import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the year ... ");

        int year = userInput.nextInt();

       /* boolean leapYear =  (year % 4 == 0);

        leapYear = leapYear && (year % 100 != 0);

        leapYear = leapYear || (year % 400 == 0);
*/
        boolean leapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);

            System.out.println("The year " + year + " is a leap year ? " + leapYear);
    }
}
