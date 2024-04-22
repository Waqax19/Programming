package Challenges;

public class Table
{
    synchronized void printTable(int num)
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println(num * i);


            try {
                Thread.sleep(500);

            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }


}
