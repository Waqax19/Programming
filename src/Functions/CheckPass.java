package Functions;

import java.util.Scanner;

public class CheckPass
{
    public static boolean checkDigits(char ch)
    {
        return (ch <= '9' && ch >= '0');

    }

    public static boolean checkLetters(char ch)
    {
        return ((ch <= 'z') && (ch >= 'a') || (ch <= 'Z' && (ch >= 'A')));
    }

    public static boolean checkPassword(String password)
    {
        boolean pass = true;

        if (password.length() < 8)
        {
            pass = false;
        }

        else
        {
            int numOfDigit = 0;

            for (int i = 0; i < password.length(); i++)
            {
                //only letters and digits
                if (checkDigits(password.charAt(i)) || checkLetters(password.charAt(i)))
                {
                    numOfDigit++;
                }

                else
                {
                    pass = false;

                    break;
                }
            }

            if (numOfDigit < 2)
            {
                pass = false;
            }
        }

        return pass;
    }

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a password ");

        String s = userInput.nextLine();

        if (checkPassword(s))
        {
            System.out.println("Valid password");
        }

        else
        {
            System.out.println("Invalid password");
        }

    }
}