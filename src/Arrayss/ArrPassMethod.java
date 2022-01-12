package Arrayss;

public class ArrPassMethod
{
    public static int findMax(int[] myArrray)
    {
        int maximum = 0;

        for (int i = 0; i < myArrray.length; i++)
        {
            if (myArrray[i] > maximum)
            {
                maximum = myArrray[i];
            }
        }

        return maximum;
    }

    public static void main(String[] args)
    {
        int[] myArray = {55,1,2,48,78,15,98,521,4,25,366,25,77,121};

        System.out.println("Max value in the array is  " + findMax(myArray));

    }
}
