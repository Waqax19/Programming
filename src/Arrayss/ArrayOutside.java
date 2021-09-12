package Arrayss;

public class ArrayOutside
{
    public static void main(String[] args)
    {
        int[] myNewArray = new int[5];

        myNewArray[0] = 750;
        myNewArray[1] = 150;
        myNewArray[2] = 250;
        myNewArray[3] = 50;
        myNewArray[4] = 150;


        for (int i : myNewArray)
        {
            System.out.println(i);
        }


       /* for (int i = 0; i < myNewArray.length ; i++)
        {
            System.out.println(myNewArray[i]);
        }*/


    }


}
