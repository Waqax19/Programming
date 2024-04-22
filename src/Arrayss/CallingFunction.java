package Arrayss;

import Functions.FnOverloading;

import javax.swing.*;

public class CallingFunction
{
    static int i;
  public static void local()
  {
       i = 5;

      System.out.println(i);
  }

  public static void another()
  {
      i = 5;
  }

    public static void main(String[] args)
    {
        for (int i = 0; i < 4; i++)
        {
            System.out.println("okau");
        }

        for (int i = 0; i < 4; i++)
        {
            System.out.println("okay");
        }
    }

}