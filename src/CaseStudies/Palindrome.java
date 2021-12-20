package CaseStudies;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner usreInput = new Scanner(System.in);

        System.out.println("Enter the String ");

        String myString = usreInput.nextLine();

        int low = 0;

        int high = myString.length() - 1;

        boolean isPalindrome = true;

        while (low < high)
        {
            if(myString.charAt(low) != myString.charAt(high))
            {
                isPalindrome = false;
                break;
            }

            low++;
            high--;


        }

        if(isPalindrome)
        {
            System.out.println("Yes " + myString +" is Palindrome");
        }

        else
            System.out.println(myString + " is not a Palindrome ");
    }
}