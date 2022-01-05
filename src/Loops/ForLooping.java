package Loops;

public class ForLooping
{
    public static void main(String[] args)
    {
       int weeks = 3;

       int days = 7;

       for (int i = 1; i <= weeks; i++)
       {
           System.out.println("Week " + i);

           if(i == 2)
               break;//ends

           for (int j = 1; j <= days; j++)
           {
               if (j == 5)
                   continue;//it will skip the current line, and will go to new line

               System.out.println("     Day : "+ j);
           }
       }

    }
}
