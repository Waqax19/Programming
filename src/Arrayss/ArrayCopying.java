package Arrayss;

import javax.swing.*;
import java.util.Arrays;

public class ArrayCopying
{
    public static void main(String[] args)
    {
        int[] sourceArray = {5,4,3,2,1};

        int[] destinationArray = new int[5];

        int[] n2 = new int[sourceArray.length];

        System.arraycopy(sourceArray, 0,destinationArray,0,sourceArray.length);

        System.out.println("Destination array is : " + Arrays.toString(destinationArray));
    }




}
