package Misclenious;

public class Cdess
{
/*
Write a method called indexOfMax that takes an array of integers and returns the index of the largest element.
 Can you write this method by using an enhanced for loop? Why or why not?
 */

    public static int indexOfMax(int arr[])
    {

        int largest = arr[0];
        int largestIndex = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];

                largestIndex = i;
            }

        }

        return largestIndex;
    }

    public static void main(String[] args)
    {
        int[] largestArray = {5,4,13,54,84,21,26,27,6,89,51,500,74,98,18,580,66,88,99};

        System.out.println("Index of the largest element is : " + indexOfMax(largestArray));

    }


}
