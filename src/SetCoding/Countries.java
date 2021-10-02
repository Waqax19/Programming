package SetCoding;

import java.util.HashSet;
import java.util.Set;

public class Countries
{
    public static void main(String[] args)
    {
        Set<String> pCountry = new HashSet<String>();

        System.out.println("Is Countries hash Set is empty ? "  + pCountry.isEmpty());

        System.out.println("Size is : "+ pCountry.size());

        pCountry.add("India");
        pCountry.add("Egypt");
        pCountry.add("Maldives");
        pCountry.add("Us");

        System.out.println("SIze of the hashSet after adding the elemets : " + pCountry.size());
    }
}
