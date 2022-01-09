package Loops;

import java.util.Scanner;

public class PasswordCheckers
{

    public static boolean checkDigits(char ch)
    {
        return (ch <= '9' && ch >= '0');
    }

    public static boolean checkLetters(char ch)
    {
        return ((ch <= 'z' && ch >= 'a') || (ch <= 'Z' && ch >= 'A'));
    }

    public static boolean checkPassword(String password)
    {


        if (password.length() < 8)
            return false;

            int numberOfDigits = 0;

            int charCounts = 0;

            for (int i = 0; i < password.length(); i++)
            {
                char ch = password.charAt(i);

                if (checkLetters(ch))
                {
                    charCounts++;
                } else if (checkDigits(ch))
                {
                    numberOfDigits++;
                } else
                {
                    return false;

                }
            }
            return (charCounts >= 2 && numberOfDigits >= 2);
        }


    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a password ... ");


        String userPass = userInput.nextLine();

        if (checkPassword(userPass))
        {
            System.out.println("Valid password ");
        }

        else
        {
            System.out.println("Invalid pass");
            System.out.println("■ A password must have at least eight characters \n");
            System.out.println("■ A password consists of only letters and digits \n");
            System.out.println("■ A password must contain at least two digits");


        }



    }
}
