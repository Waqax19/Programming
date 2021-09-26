package Arrayss;

public class BinarySearch
{
    public static void main(String[] args)
    {


    }

    public static int binaryS(int[] list, int key)
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
    }
}
