package Functions;

public class VarLenArg
{
    public static void main(String[] args)
    {
        System.out.println("The sum of 2 and 4 is : " + sum(2,4));

        System.out.println(sum(2,2,5,4,5,4,8,7,9,8,7,4,5,4,5,4,5,4,1,2,5,4,5,4,4,56,56,89,78,54,21,58));

    }


    public static int sum(int... list)
    {
        int total = 0;

        for (int i = 0; i < list.length; i++)
        {
            total += list[i];
        }

        return total;
    }
}
