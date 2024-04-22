package Challenges;

public class MyHashMap<K , V>
{
    private Entry<K, V>[] buckets;

    private static final int CAPACITY = 1 << 4;//16

    private int size = 0;


    public MyHashMap()
    {
        this(CAPACITY);
    }

    private int getBucketSize()
    {
        return buckets.length;
    }


    public MyHashMap(int capacity)
    {
        this.buckets = new Entry[capacity];
    }

    private int getHash(K key)
    {
        return (key.hashCode() & 0xfffffff) % CAPACITY;
    }


 /*   private Challenges.Entry getEntry(K key)
    {
        int hash = getHash(key);


        for (int i = 0; i < bucket[hash].getEntries().size(); i++)
        {
            Challenges.Entry keyValueEntry = bucket[hash].getEntries().get(i);

            if(keyValueEntry.getKey().equals(key))
            {
                return keyValueEntry;
            }
        }
        return null;
    }*/


    public void put(K key, V val)
    {
        Entry<K , V> entry = new Entry<>(key, val, null);

        int bucket = getHash(key) % CAPACITY;

        Entry<K, V> existing = buckets[bucket];


        if(existing == null)
        {
            buckets[bucket] = entry;

            size++;
        }
        else
        {
            while (existing.next != null)
            {
                if (existing.key.equals(key))
                {
                    existing.value = val;
                    return;
                }

                existing = existing.next;
            }
        }


        if (existing.key.equals((key)))
        {
            existing.value = val;
        }

        else
        {
            existing.next = entry;
            size++;
        }
    }

    public V get(K key)
    {
        Entry<K, V> bucket = buckets[getHash(key) % getBucketSize()];

        while (bucket != null)
        {
            if (bucket.key.equals(key))
            {
                return bucket.value;
            }

            bucket = bucket.next;
        }

        return null;
    }


    public static void main(String[] args)
    {
        MyHashMap<String, String> myHashMap = new MyHashMap<>();

        myHashMap.put("Egy", "Cairo");
        myHashMap.put("Ind", "NewDelhi");
        myHashMap.put("Ita", "Rome");
        myHashMap.put("UAE", "Abu-Dahbi");

        myHashMap.toString();


    }





}
