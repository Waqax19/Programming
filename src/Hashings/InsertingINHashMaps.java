package Hashings;

public class InsertingINHashMaps<K,V>
{
    private MyMap<K,V>[] buckets;

    //private static final int initial_capacity =

    public InsertingINHashMaps()
    {

    }

    private int size = 0;

    public InsertingINHashMaps(int capacity)
    {
        this.buckets = new MyMap[capacity];
    }

    public int getBucketNumber(K key)
    {
        return Math.abs(key.hashCode()) % this.buckets.length;
    }

    public void put(K key, V value)
    {
        MyMap<K,V> entry = new MyMap<>(key, value, null);

        //TODO: GetHash()
        int bucket = getBucketNumber(key);


       MyMap<K,V> existing  = buckets[bucket];

       if(existing == null)
       {
           buckets[bucket] = entry;

           size++;
       }

       else
       {
           //compare the key and check if the key is already there ?

           while (existing.next != null)
           {
               if(existing.key.equals(key))
               {
                   existing.value = value;
                   return;
               }

               existing = existing.next;
           }

           if (existing.key.equals(key))
           {
               existing.value = value;
           }

           else
           {
               existing.next = entry;
               size++;
           }
       }
    }

    public V get(K key)
    {
        MyMap<K,V> bucket = buckets[getBucketNumber(key)];

        while (bucket != null)
        {
            if(bucket.key.equals(key))
            {
                return bucket.value;
            }

            bucket = bucket.next;
        }
        return null;
    }

    public static void main(String[] args)
    {
        InsertingINHashMaps<String,String> myMaps = new InsertingINHashMaps<>();

        myMaps.put("UK","London");
        myMaps.put("India","New Delhi");
        myMaps.put("Egypt","Cairo");
        myMaps.put("Russia","Moscow");

        myMaps.toString();





    }
}
