package Arrayss;

public class VarLenArg
{
    public static void myArguments(String... myString)
    {
        System.out.println("\nNumber Of Arguments are : " + myString.length);

        System.out.println("Values are ");

        for (String s : myString)
        {
            System.out.println(s);
        }
    }

    public static void main(String[] args)
    {
        myArguments("Something");

        myArguments("Hello","there", "apple","mango","example");

        myArguments();



    }
}
