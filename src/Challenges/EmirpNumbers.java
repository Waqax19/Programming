package Challenges;

public class EmirpNumbers
{


    public static boolean isPrime(int number)
    {

        //a number that is divisible only by itself and 1


        if(number < 2)
        {
            return false;
        }

//5/2 = 2.5

        for (int i = 2; i <= number / 2; i++)
        {
            if (number % i == 0)
                return false;//it wll not be a prime
        }

        return true;//it will be prime number

    }


    public static int getMersennePrimeNumber(int p)
    {
        return (int) (Math.pow(2, p) - 1);//type cast it to int



    }




    public static void main(String[] args)
    {

        System.out.printf("%-10s%7s\n","p","2*p-1");


       for (int i = 2; i < 31; i++)
       {
           //17 != 71
           if (isPrime(i))
           {

               System.out.printf("%-10d%10d\n", i, getMersennePrimeNumber(i));


           }
       }

    }
}
