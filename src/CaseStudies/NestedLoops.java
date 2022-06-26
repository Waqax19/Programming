package CaseStudies;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class NestedLoops {

    public static void reverse(int myArray[]) {
        System.out.println("Original Array : " + Arrays.toString(myArray));

        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.println(myArray[i] + " ");
        }
    }


    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        reverse(array);
    }


}

      //reverseal

      /*  Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the elements .. ");

        int numberOfElements = userInput.nextInt();

        int[] array = new int[10];

        for (int i = 0; i < numberOfElements; i++)
        {
            array[i] = userInput.nextInt();
        }


        System.out.println("Before reversal , elements of the array are : ");
        for (int i = 0; i < numberOfElements; i++)
        {
            System.out.println(array[i]);
        }


        //System.out.println("Reversal of the array is : " + (myObj.reverse(array));

       System.out.println(Arrays.toString(array));*/
