package Loops;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SentinalLoop
{
    public static void main(String[] args)
    {
      int weeks = 3;

      int days = 7;

        int i = 1;

        //0-9 , exclusive means 0 and 9 will not be included
        //0-9 inclusive, means 0 and 9 will be included
        int myNum = (int) (Math.random() * 101);//0 - 100

      while (i <= weeks)//outer
      {
          System.out.println("Week: " +  i);

          for (int j = 1; j <= days; j++)//inner
          {
              System.out.println("  Day : " + j);
          }
          i++;
      }
    }
}
