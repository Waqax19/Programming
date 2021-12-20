package Arrayss;

import java.util.Arrays;

public class BinarySearch
{
    public static void main(String[] args)
    {
        //sorting
        int myArray[] = {55,4,8,5,98,54,78,12,80,67};

        Arrays.sort(myArray);

        Arrays.parallelSort(myArray);

        System.out.println("Integer array : " + Arrays.toString(myArray));


/*
        System.out.println("Sorted array is : " + Arrays.toString(myArray));

        //binary search

        int key = 80;

        System.out.println("Searching for " + key + " we found at index " + Arrays.binarySearch(myArray, key));
*/
    }

   /* public static int binaryS(int[] list, int key)
    {
        int lowerHalf = 0;

        int upperHalf = list.length - 1;

        while (upperHalf >= lowerHalf)
        {
            int mid = (lowerHalf + upperHalf ) / 2;

            if (key < list[mid])
            {
                upperHalf = mid - 1;
            }

            else if(key == list[mid])
            {
                return mid;
            }

            else
                lowerHalf = mid + 1;
        }
        return lowerHalf;
    }*/
}
