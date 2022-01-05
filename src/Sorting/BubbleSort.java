package Sorting;

public class BubbleSort
{
    static void bubbleSort(int arr[], int num)
    {
        if(num <= 1)
        {
            return;
        }

        for (int i = 0; i < num - 1; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        bubbleSort(arr, num - 1);



    }

    static void display(int arry[])
    {
        for (int i = 0; i < arry.length; i++)
        {
            System.out.println(arry[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {2,9,5,4,8,1,6};

        bubbleSort(arr, arr.length);

        display(arr);

    }
}
