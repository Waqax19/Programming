package SetCoding;

import java.io.Serializable;
import java.util.*;

public class SetCod
{
    public static void main(String[] args)
    {

       HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");

        hashSet.add("One");

        hashSet.add("Four");

        //adding of null elements
        hashSet.add(null);

        hashSet.add(null);//ignored

        System.out.println("Unordered and no duplicate HashSet Elements ");

        System.out.println(hashSet);

    }
}
