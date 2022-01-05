package Selections;

import java.util.Random;
import java.util.Scanner;

public class Lottery
{
    public static void main(String[] args)
    {
       /* Random randomNum = new Random();

        int randomInt = 90 + (int) (Math.random() * 100);//between 1 and 100*/

        Random random = new Random();
        int low = 10;

        int high = 100;

        int res = random.nextInt(high - low) + low;

        System.out.println(res);
    }
}
