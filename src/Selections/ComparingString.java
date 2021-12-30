package Selections;

public class ComparingString
{
    public static void main(String[] args)
    {
        String name = "hello";

        String name1 = "hello";

        String name3 = "meklo";

        String name4 = "hemlo";

        String name5 = "flag";

        System.out.println(name.compareTo(name1));//0

        System.out.println(name.compareTo(name3));//5

        System.out.println(name.compareTo(name4));//-1

        System.out.println(name.compareTo(name5));//2

    }
}
