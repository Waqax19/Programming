package Generics;

import java.util.ArrayList;

public class RemoveDuplicates
{
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
    {

        ArrayList<E> myList = new ArrayList<>(list.size());

        for (E newList : list)
        {
            if (!(myList.contains(newList)))
            {
                myList.add(newList);
            }
        }

        return myList;
    }


    public static void main(String[] args)
    {
        ArrayList<String> myString = new ArrayList<>();

        for (int i = 0; i < 20; i++)
        {
            myString.add("there");
        }

        myString = removeDuplicates(myString);


        for (String s : myString)
        {
            System.out.println(s);
        }

    }
}
