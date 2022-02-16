
package Recursion;

import java.util.Scanner;

public class Main
{
    public static long fibonacciNumber(long num)
    {
        int maxNum = 50;

        if (num == 0)
            return 1;

        else if (num == 1)
            return 1;

        else {
            for (int i = 0; i < maxNum; i++)
                return fibonacciNumber(num - 1) + fibonacciNumber(num - 2);
        }
        return maxNum;
    }
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        int num = userInput.nextInt();
        System.out.println(fibonacciNumber(num));
    }
}
