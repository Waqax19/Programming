package OOP;

public class Replacement
{
    public static void main(String[] args)
    {
        String str = new String("veeka,andthere");

        String[] arr = str.split("[, ?.and]+");

        for (String s: arr)
        {
            System.out.println(s);
        }


    }
}
