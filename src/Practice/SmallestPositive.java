package Practice;

public class SmallestPositive
{
    public static void main(String[] args)
    {
        /*
        2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

        What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
         */

        int num = 1;

        while (num <= 20)
        {
            if (isDivisible(num))
                System.out.println(num);

        }
        //num++;



    }

    public static boolean isDivisible(int num)
    {
        for (int i = 1; i <= 20; i++)
        {
            if (num % i != 0)
            {
                return false;
            }
        }
        return true;
    }

}
