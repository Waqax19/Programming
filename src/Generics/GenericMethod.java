package Generics;

public class GenericMethod
{
    public static <Russia> void printArray(Russia[] inputArray)
    {
        //display array elements
        for (Russia element : inputArray)
        {
            System.out.printf("%s", element);
        }
    }

    public static void main(String[] args)
    {
        Integer[] intArr = {1,2,3,4,5,6};

        Double[] doubleArr = {1.1,2.2,3.3,4.5};

        Character[] charArr = {'H','E','L','L','O'};

        System.out.println("Array integerArr contains : " );
        printArray(intArr);

        System.out.println("\nDouble array contains ");
        printArray(doubleArr);

        System.out.println("\nArray character array contains ");
        printArray(charArr);

    }
}
