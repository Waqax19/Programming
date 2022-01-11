package Functions;
import java.util.Random;
import java.util.Scanner;

public class Dicess {

//    public static void Getsum(int dice1, int dice2) {
//        int Getsum = dice1 + dice2;
//    }
/*
    public static int CheckDice(int Getsum)
    {


        while (true)
        {
            if (Getsum == 2 || Getsum == 3 || Getsum == 12) {
                System.out.println("craps, You Lose.");
            }

            if (Getsum == 7 || Getsum == 11) {
                System.out.println("Natural, You Win.");
            }

            if (Getsum == 4 || Getsum == 5 || Getsum == 6 || Getsum == 8 || Getsum == 9 || Getsum == 10) {
                System.out.println("Continue to roll the dice until either a 7 or the same point is rolled.");

            }
        }
    }*/

    public static int rollDice()
    {
        Random rand = new Random();

        int randomNum = 1 + rand.nextInt(6);//from 1 to 6

        return randomNum;
    }

    public static void main(String[] args)
    {
        do {

            int roll1 = rollDice();

            int roll2 = rollDice();

            int sum = roll1 + roll2;

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + sum);
                System.out.println("Craps: \n You Lose");
            } else if (sum == 7 || sum == 11) {
                System.out.println("\nYou rolled " + roll1 + " + " + roll2 + " = " + sum);
                System.out.println("Natural \nYou win");
                break;
            }

            else
            {
                System.out.println("\nYou rolled " + roll1 + " + " + roll2 + " = " + sum);
                System.out.println("Point is " + sum);
            }

        }while (true);
    }
}