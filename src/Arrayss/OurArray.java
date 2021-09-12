package Arrayss;

public class OurArray
{
    public static void main(String[] args)
    {

        int[] myArray =  {10,30,20,40,50};

        /*int[] myArray;//declaration of array
        int sum = 0;
        */
        myArray = new int[55];//initialization of array

        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 40;
        myArray[4] = 50;


        System.out.println("Value at index 1 is : "+ myArray[1]);

















/*
        for (int i : myArray)
        {
            sum += i;
        }*/

        /*for (int i = 0; i < myArray.length; i++)
        {
            sum += i;
            System.out.println("Element at index : " + i + " is : " + myArray[i]);

        }*/

       /* System.out.println("Sum of all the elements of the array is : " + sum);*/




    }
}
