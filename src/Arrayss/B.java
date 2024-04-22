package Arrayss;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class B
{
   void m() throws IOException
   {
       throw new IOException("device error");
   }

   void n() throws IOException
   {
       m();
   }

   void p()
   {
       try
       {
           n();
       }

       catch (Exception e)
       {
           System.out.println("Exception handled..");
       }
   }
    public static void main(String[] args)
    {
        B myObj = new B();
        myObj.p();
        System.out.println("normal flow...");
    }
}
