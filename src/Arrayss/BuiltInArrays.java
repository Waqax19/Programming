package Arrayss;

import java.util.Arrays;

public class BuiltInArrays
{
    public static void main(String[] args)
    {
        /*int myArray[] = {9,2,145,87,54,985,14,22,33,478,5};

       Arrays.sort(myArray, 1 , 5);//built in function

        System.out.println("Arrays is sorted ..." + Arrays.toString(myArray));*/

       /* int myChars[] = {'a','A','4','F','D','P'};

        Arrays.sort(myChars);

        System.out.println("Characters after sorting .. " + Arrays.toString(myChars));*/

        int myArray[] = {9,2,145,87,54,985,14,22,33,478,5};

        Arrays.sort(myArray);//sort the array first to perform binary search



        System.out.println("Arrays is sorted ..." + Arrays.toString(myArray));

        int key = 33;

        System.out.println(key + " found at index " + Arrays.binarySearch(myArray, key));





    }
}
