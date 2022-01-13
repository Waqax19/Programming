package Arrayss;

public class LinearSearching
{
    public static int linearSearch(int[] arr, int key)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == key)
            {
                return i;
            }
        }

        return -1;//search didn't found the element

    }

    public static void main(String[] args)
    {
        int[] array1 = {10,20,30,40,50,60,70,80,90,45454,4548754,8745,47845,48754,8754,89746541,54987,65198756,198765,189461,984621,984651,19846};

        int key = 65198756;

        System.out.println(key + " is present at index " + linearSearch(array1, key));

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken by linear searach : " + (endTime - startTime) + " ms");

    }



}
