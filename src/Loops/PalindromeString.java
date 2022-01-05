package Loops;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PalindromeString
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a string ");

        String s = userInput.nextLine();

        int low = 0;//starting index

        int high = s.length() - 1;

        boolean isPalindrome = true;

        while (low < high)
        {
            char lowerChars = s.charAt(low++);//mooon

            char highChars = s.charAt(high--);

            if(lowerChars != highChars)
            {
                isPalindrome = false;
                break;

            }
            /*low++;
            high--;*/
        }

        if (isPalindrome == true)
        {
            System.out.println(s + "  is a palindrome");
        }

        else
            System.out.println(s + " is not a palindrome");

    }
}
