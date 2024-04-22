package Challenges;

import java.util.Scanner;

public class LotteryNumbers
{
    public static void main(String[] args)
    {
        //generate lottery number
        int lottery = (int) (Math.random() * 100);//0 - 99
        //08

        System.out.println(lottery);


        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your lottery number (two digits)");

        int guess = userInput.nextInt();//from user

        //get digits from lottery
//56/10
        int lotteryDigit1 = lottery / 10; // 5.6 - > 5
        int lotteryDigit2 = lottery % 10;// 56 % 10 - > 6

        int guessDigit1 = guess / 10;//75 -> 7.5
        int guessDigit2 = guess % 10;// 7.5 % 10 - > 5

        // 75
        // 17

        if(guess == lottery)
        {
            System.out.println("Exact Match, you win $10,000");
        }

        else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1)
        {
            System.out.println("Match all digits , you won $3,000");
        }

        else
        {
            System.out.println("No luck today ");
        }




    }
}
