package Sorting;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class GuessTheMagicNumber
{
    public static void main(String[] args)
    {
        //nested loops
        /*
        1 : initialization
        2 : loop continuation condition
        3: statements
        4: increment/decrement
         */

       //tuition fee

        double fee = 10000;

        int year = 0;

        while (fee <= 20000)
        {
            fee = fee * 1.07;
            year++;
        }

        //System.out.println("Tuition fee will be " + fee +"  in : " + year + " years ");

        //formatting the output
        System.out.printf("Tuition fee will be %.5f in %1d years ", fee, year );


    }
}