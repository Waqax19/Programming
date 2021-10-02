package SetCoding;

import java.io.Serializable;
import java.util.*;

public class SetCod
{
    public static void main(String[] args)
    {

       ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");
        arrayList.add("Five");

        arrayList.add("One");

        arrayList.add("Four");

        System.out.println("Original elements Order " + arrayList);

        HashSet<String> hashSet = new HashSet<String>();

        hashSet.addAll(arrayList);

        System.out.println("UnOrdered HashSet elements without duplicate elements ");

        System.out.println(hashSet);

    }
}
