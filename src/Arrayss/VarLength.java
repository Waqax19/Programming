package Arrayss;

public class VarLength
{
    public static void display(int... myVar)
    {
        System.out.println("The number of variables we are passing is : " + myVar.length );

        for (int i : myVar)
        {
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args)
    {
        display(5);

        display(5,5,5,5,5,5,5);

        display(12,45,78,98,87,45,65,54,32,12,45,7898,78,45,12,45,45,4,65);



    }
}
