package NewCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MyListsCollections
{
    public static void main(String[] args)
    {
        ArrayList<String> collection1 = new ArrayList<>();

        collection1.add("NewYork");
        collection1.add("Milan");
        collection1.add("Paris");
        collection1.add("Kiev");

        System.out.println("A list of cities in collection1 ");
        System.out.println(collection1);

        System.out.println("\nIs Paris is included in city list ? " + collection1.contains("Paris"));

        System.out.println("\n" + collection1.size() + " cities in collection1 ");

        ArrayList<String> collection2 = new ArrayList<>();

        collection2.add("Cairo");
        collection2.add("NewDelhi");
        collection2.add("Florence");
        collection2.add("Zurich");

        System.out.println("A list of cities in collection2 ");
        System.out.println(collection2);

        ArrayList<String> c1 = (ArrayList<String>) (collection1.clone());

        c1.addAll(collection2);

        System.out.println("\nCities in collection1 and collection2 ");
        System.out.println(c1);

        c1 = (ArrayList<String>) (collection1.clone());

        c1.retainAll(collection2);//both collections data will be deleted

        System.out.println("\nCities in collection1 and collection2");
        System.out.println(c1);

        c1 = (ArrayList<String>) (collection1.clone());

        c1.removeAll(collection2);//will remove

        System.out.println("\nCities in collection1 but not in collection2");
        System.out.println(c1);









    }
}
