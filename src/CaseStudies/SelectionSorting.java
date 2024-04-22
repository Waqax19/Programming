package CaseStudies;

import java.sql.ClientInfoStatus;

public class SelectionSorting
{

   public static void selectionSort(int array[])
    {
        int size = array.length;

      for (int step = 0; step < size - 1; step++)
      {
          int minimum_index = step;

          for (int i = step + 1; i < size; i++)
          {
              if (array[i] < array[minimum_index])//ascending order, if you want in descending order then change < to > .
              {
                minimum_index = i;
              }
          }


          int temp = array[step];

          array[step] = array[minimum_index];

          array[minimum_index] = temp;
      }
    }


    public static void printArray(int arr[])
    {
        int n = arr.length;

        for (int i = 0; i < n; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        int[] data = {20 , 12 , 10 , 15, 2};

        selectionSort(data);//sort the data

        System.out.println("Sorted array is : ");

        printArray(data);


    }
}
