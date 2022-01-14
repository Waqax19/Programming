package Arrayss;

public class SortItOut
{
    //selection sort
    public static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;

            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[index])
                {
                    index = j;//searching for lowest index

                }
            }

            int smallerNumber = arr[index];

            arr[index] = arr[i];

            arr[i] = smallerNumber;
        }
    }

    public static void main(String[] args)
    {
        int[] myArray = {9,2,145,87,54,985,14,22,33,478,5};

        System.out.println("Before selection sort ");

        for (int i : myArray)
        {
            System.out.println(i + " ");
        }

        System.out.println();

        selectionSort(myArray);

        System.out.println("After selection sort ");

        for (int i : myArray)
        {
            //System.out.printf("%3d", i , " " );
            System.out.println(i + " ");
        }

    }
}
