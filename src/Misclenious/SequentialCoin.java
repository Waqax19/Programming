package Misclenious;

import java.util.ArrayList;
import java.util.Random;

public class SequentialCoin {


    public static ArrayList<Integer> findAll(ArrayList<String> list, String name)
    {
        ArrayList<Integer> mylist = new ArrayList<>();

        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).equals(name))
                mylist.add(i);
        }

        return mylist;
    }

    public static void main(String[] args)
    {
        ArrayList<String> myList = new ArrayList<String>();
//"Bob", "Carl", "Bob", "David"
        myList.add("athar");
        myList.add("candy");
        myList.add("athar");
        myList.add("athar");

        System.out.println(findAll(myList,"athar"));
    }
}
