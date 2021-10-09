package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayList
{
    public static <E extends Comparable<E>> void sort(ArrayList<E> list)
    {
        int minimumIndex;

        for (int i = 0; i < list.size(); i++)
        {
            //find min element in the array list

            E minElement = list.get(i);

            minimumIndex = i;

            for (int j = i + 1; j < list.size(); j++)
            {
                if (minElement.compareTo(list.get(j)) > 0)
                {
                    minElement = list.get(j);
                    minimumIndex = j;
                }
            }

            if(minimumIndex != i)
            {
                list.set(minimumIndex, list.get(i));
                list.set(i, minElement);
            }
        }
    }

    public static void main(String[] args)
    {
        Integer[] intArray = {2, 4, 1};
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(intArray));

        SortArrayList.sort(intList);

        System.out.println("Int array list sorting : " + intList);
    }

}
