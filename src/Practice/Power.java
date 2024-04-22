package Practice;

import java.math.BigInteger;

public class Power
{
    public static void main(String[] args)
    {
        /*
        215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 21000?
         */

       // System.out.printf("%.1f",Math.pow(2,1000));

        int result = 0;

       String value = BigInteger.valueOf(2).pow(1000).toString();

       for (char c : value.toCharArray())
       {
           result = result + Character.getNumericValue(c);
       }
        System.out.println(result);


    }
}
