package Recursion;

public class RecursionVsIteration
{
    public static int fact(int num)
    {
        int res = 1;

        if (num <= 1)
        {
            return  res;
        }

        while (num > 1)
        {
            res *= num;

            num--;
        }

        return res;
    }

    public static int factorial(int num)
    {
        if (num <= 1)
        {
            return 1;
        }

        return num * factorial(num - 1);
    }

    public static void main(String[] args)
    {
        long start = System.nanoTime();

        int res = fact(150);//iteration 12400

       // int res1 = factorial(150);//recursion 35800

        long end = System.nanoTime();

        long elapsed = end - start;

        System.out.println("Time : " + elapsed);

    }
}
