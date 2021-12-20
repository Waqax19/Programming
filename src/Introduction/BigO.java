package Introduction;

public class BigO
{
    public static void main(String[] args)
    {
        getTime(100000);

        getTime(1000000);

        getTime(100000000);

        getTime(1000000000);

    }

    public static void getTime(long num)
    {
        long startTime = System.currentTimeMillis();

        long k = 0;
        //time complexity O(n^2)

        for (int i = 1; i <= 10; i++)//sequence
        {
            for (int j = 1; j <= 20; j++)//O(n)
                k = k + i + j;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Time of execution for num : " + num + " is " + (endTime - startTime) + " ms");

    }
}
