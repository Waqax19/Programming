package Generics;

public class GenericSorting
{
    //sort an array of comparable objects
    public static <Marco extends Comparable<Marco>> void sort(Marco[] list)
    {
        Marco currentMinimum;
        int currentMinimumIndex;

        for (int i = 0; i < list.length; i++)
        {
            //find the minimum in the list
            currentMinimum = list[i];
            currentMinimumIndex = i;

            for (int j = i + 1;j < list.length; j++)
            {
                if(currentMinimum.compareTo(list[j]) > 0)
                {
                        currentMinimum = list[j];
                        currentMinimumIndex = j;
                }
            }

            if(currentMinimumIndex != i)
            {
                list[currentMinimumIndex] = list[i];
                list[i] = currentMinimum;
            }
        }
    }

    public static void printList(Object[] list)
    {
        for (int i = 0; i < list.length; i++)
        {
            System.out.println(list[i] + " ");

            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Integer[] intArray = {2,4,3};

        Double[] doubleArray = {2.55,-55.45,1.3};

        Character[] charArray = {'a','J','r'};

        String[] stringArray = {"Tommy","Susan","Kim"};

        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);

        System.out.println("Sorted int objects : ");
        printList(intArray);

        System.out.println("Sorted double objects : ");
        printList(doubleArray);

        System.out.println("Sorted char objects : ");
        printList(charArray);

        System.out.println("Sorted string objects : ");
        printList(stringArray);


        
    }

}
