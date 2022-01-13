package Arrayss;

public class Summing
{
    public static int sum(int... list)
    {
        int total = 0;

        for (int i = 0; i < list.length; i++)
        {
            total += list[i];

        }

        return total;
    }

    public static void main(String[] args)
    {

        System.out.println("The sum of 5 and 10 is : " + sum(5,10));

        System.out.println(sum(5,10,15,20,25,10,15,45,78,98,45,14,245,78,78,78));


        int[] numbers = {2,4,6,8,10,12,14,16,18,20};

        System.out.println("The sum of array is : " + sum(numbers));



    }
}
