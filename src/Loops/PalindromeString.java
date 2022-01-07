package Loops;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PalindromeString
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a String ");

        String newString = userInput.nextLine();

        int startingIndex = 0;

        int lastIndex = newString.length() - 1;

        boolean isPalindrome = true;

        while (startingIndex < lastIndex)
        {
            if (newString.charAt(startingIndex) != newString.charAt(lastIndex))
            {
                isPalindrome = false;
                break;
            }

            startingIndex++;
            lastIndex--;

        }

        if(isPalindrome)
        {
            System.out.println("Yes it is a palindrome ");
        }
        else
        {
            System.out.println("it is not a palindrome");
        }

    }
}
