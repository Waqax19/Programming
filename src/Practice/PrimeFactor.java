package Practice;

public class PrimeFactor
{
    public static void main(String[] args) {
        /*
        The prime factors of 13195 are 5, 7, 13 and 29.

        What is the largest prime factor of the number 600851475143 ?
         */

        Long num = 600851475143L;

        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
            {
                num = num / i;

                i--;
            }
        }


            if (num >= 2) {
                System.out.println("Largest factor is : " + num);
            }

    }
}
