package Selections;

import java.util.Scanner;

public class Lottery
{
    public static void main(String[] args)
    {
        int lottery = (int) (Math.random() * 100);//between 0 and 99

        System.out.println("The lottery number is : " + lottery);

        //prompt the user
        System.out.println("Enter your lottery number ");

        Scanner userInput = new Scanner(System.in);

        int userGuess = userInput.nextInt();


        //now extract the digits
//97
        int lotteryDigit1 = lottery / 10;//9
        int lotteryDigit2 = lottery % 10;//7

        int guessDigit1 = userGuess / 10;

        int guessDigit2 = userGuess % 10;



        if(userGuess == lottery)
        {
            System.out.println("Exact match, great you won $10,000");
        }

        else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1)
        {
            System.out.println("Matched all digits , you won $3,000");
        }

        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 ||
                guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
        {
            System.out.println("Matched one digit, you won $1,000");
        }

        else
            System.out.println("Better luck next time ");




    }
}
