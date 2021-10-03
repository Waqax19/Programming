package Arrayss;

public class SelectionSort
{

    public static void selectionSorting(int arr[])
    {
        int array_length = arr.length;

        for (int i = 0; i < array_length - 1; i++)
        {
            int minimum_position = i;

            for (int j = i + 1; j < array_length; j++)
            {
                if(arr[j] < arr[minimum_position])
                {
                    minimum_position = j;

                }
            }

            //swapping
            int temp = arr[i];

            arr[i] = arr[minimum_position];

            arr[minimum_position] = temp;

        }

        System.out.println("The sorted array is : ");

        for (int i = 0; i < array_length;i++)
        {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        int[] myArray = {55,4,8,5,98,54,78,12,80,67};

        selectionSorting(myArray);
    }
}
