package Challenges;

import java.util.LinkedList;
import java.util.List;

public class MapBucket
{
    private List<Entry> entries;



    public MapBucket()
    {
        if (entries == null)
            entries = new LinkedList<>();
    }

    public List<Entry > getEntries()
    {
        return entries;
    }

    public void addEntry(Entry entry)
    {
        this.entries.add(entry);
    }

    public void removeEntry(Entry entry)
    {
        this.entries.remove(entry);
    }

   /* public int getBucketSize()
    {
        return getBucketSize();
    }*/
}
