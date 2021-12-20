package Functions;

import java.util.Scanner;

public class IntPalindromes
{
    //method that will return the reverse of an integer

    public static int reversal(int number)
    {
        String reversed = "";

        String num = number + "";//convert num to string

        //Reverse String
        for (int i = num.length() - 1; i >= 0; i--)
        {
            reversed += num.charAt(i);
        }

        return Integer.parseInt(reversed);
    }

    public static boolean isPalindrome(int num)
    {
        return  num == reversal(num) ? true : false;
    }

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter an integer ");

        int number = userInput.nextInt();

        System.out.println(number + (isPalindrome(number) ? " is palindrome" : " is not a palindrome"));

    }
}