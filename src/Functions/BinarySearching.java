package Functions;

public class BinarySearching
{
    public static void binarySearch(int arr[], int right_half, int left_half, int key)
    {
        int mid = (right_half + left_half) / 2;

        while (right_half <= left_half)
        {
            if (arr[mid] < key)
            {
                right_half = mid + 1;
            }

            else if (arr[mid] == key)
            {
                System.out.println("Element is present at index : " + mid);
                break;
            }

            else
            {
                left_half = mid - 1;

            }

            mid = (left_half + right_half) / 2;
        }


        if(right_half > left_half)
        {
            System.out.println("Element is not found !! ");
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {10,20,30,40,50,60,70,80,90,100,150,180,190,250};

        int key = 180;

        int last = arr.length - 1;

        binarySearch(arr,0,last, key);
    }
}
