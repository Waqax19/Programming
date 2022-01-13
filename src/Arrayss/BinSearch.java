package Arrayss;

public class BinSearch
{
    public static void binarySearch(int[] list, int key)
    {
        int low = 0;

        int high = list.length - 1;

        int middle = (low + high) / 2;

        if(key < list[middle])
        {
            high = middle - 1;
            System.out.println("Value is present at " + high);
        }
        else if (key == list[middle])
        {
            System.out.println("Value is present at middle : " + middle);
        }
        else
        {
            low = middle + 1;

            System.out.println("Value is present at " + low);
        }
    }

    public static void main(String[] args)
    {
        int myArray[] = {10,20,30,40,50,60,70,90};

        int key = 30;

        int last = myArray.length - 1;

        binarySearch(myArray, key);

    }

}
