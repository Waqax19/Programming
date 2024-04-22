package Challenges;

import java.math.BigInteger;

public class FactSum
{

    private static BigInteger fact(int val)
    {
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= val; i++)
        {
            fact = fact.multiply(BigInteger.valueOf(i));

        }
        return fact;

    }



    private static int sum(int val)
    {
        var digit = fact(val).toString();
        var sum = 0;

        for (var c : digit.toCharArray())
        {
            sum += Integer.parseInt(Character.toString(c));
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(sum(100));

    }


}
