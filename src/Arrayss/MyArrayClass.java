package Arrayss;

public class MyArrayClass
{
    public static void main(String[] args)
    {
        int newArray[] = {70,80,90,100,110,300};//declaration n initializing


        //initialize the values

        /*
        newArray[0] = 50;

        newArray[1] = 60;

        newArray[2] = 70;

        newArray[3] = 80;

        newArray[4] = 90;
*/
        for (int arr : newArray)
            System.out.println("The value at index " + newArray[arr] + " is " + arr);



    }
}
