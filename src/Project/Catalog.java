package Project;
import java.util.*;

public class Catalog {

    private ArrayList<Item> items;
    private String name;

    public Catalog(String name)
    {
        //Constructor that takes the name of this catalog as a parameter. The name will be a String.
        this.name = name;
        this.items = new ArrayList<>();

    }

    public void add(Item next)
    {
        //Adds an Item at the end of this list.
        items.add(next);
    }

    public int size()
    {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code
        return items.size();
    }

    public Item get(int index)
    {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code
        //Returns the Item with the given index (0-based).

        return items.get(index);
    }

    public String getName() {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code
        return name;
    }
}
