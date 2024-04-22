package ObjectOrientation;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo
{
    void myFunction() throws IOException
    {
        throw new IOException("Device Error");
    }

    void myFunction2() throws IOException
    {
        myFunction();
    }

    void myFunction3()
    {
        try
        {
            myFunction2();
        }
        catch (Exception e)
        {
            System.out.println("Exception is handled..");
        }
    }

    public static void main(String[] args)
    {
        ExceptionDemo demo = new ExceptionDemo();
        demo.myFunction3();

        System.out.println("rest of the code...");
    }
}
