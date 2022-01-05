package Sorting;

public class InsertionSort
{
    static void insertionSort(int arr[], int num)
    {
        if(num <= 1)
        {
            return;
        }

        insertionSort(arr, num - 1);

        int last = arr[num - 1];//last element of the array

        int j = num - 2;//

        while (j >= 0 && arr[j] > last)
        {
            arr[j+ 1] = arr[j];

            j--;
        }

        arr[j + 1] = last;
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

        insertionSort(arr, arr.length);

        display(arr);

    }
}
