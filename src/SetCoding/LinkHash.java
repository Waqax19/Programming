package SetCoding;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHash
{
    public static void main(String[] args)
    {
        LinkedHashSet<String> myValues = new LinkedHashSet<>();

        myValues.add("Five");
        myValues.add("Four");
        myValues.add("Three");
        myValues.add("Two");
        myValues.add("One");
        myValues.add("Three");
        myValues.add("Four");

        Iterator<String> i = myValues.iterator();

        while (i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
