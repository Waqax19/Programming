package Arrayss;

public class ArrReturning 
{
    public static void main(String[] args)
    {

        System.out.println("The sum of all the numbers is : " + sum(5,10,15,45,87,98,78,54,25,36));

    }

    public static int sum(int... myNumbers)
    {
        int total = 0;

        for (int i = 0; i < myNumbers.length; i++)
        {
            total += myNumbers[i];
        }

        return total;
    }
}
