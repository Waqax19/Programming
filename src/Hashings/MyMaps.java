package Hashings;

public class MyMaps<K,V>
{
    public Entry<K,V>[] buckets;

    public Entry<K,V>[] myObj;

    //private static final int initial_capacity =

    private int capacity;

    private int size = 0;

    private double limit_factor = 0.75;


    public MyMaps()
    {

    }

    public MyMaps(int capacity)
    {
        this.capacity = capacity;
        this.buckets = new Entry[this.capacity];
    }



    public void put(K key, V value)
    {
       if(size == limit_factor * capacity)
       {
           Entry<K,V>[] old = buckets;

           capacity *= 2;

           size = 0;

           buckets = new Entry[capacity];


           for (Entry<K,V> e: old)
           {
               while (e != null)
               {
                   put(e.key, e.value);
                   e = e.next;
               }
           }
       }

        Entry<K,V> entry = new Entry<>(key,value, null);

       int bucket = entry.getHash(key) % getBucketSize();

       Entry<K,V> existing =  buckets[bucket];

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
                   existing.value = value;

                   return;
               }

               existing = existing.next;
           }
       }

       if(existing.key.equals(key))
       {
           existing.value = value;
       }

       else
       {
           existing.next = entry;

           size++;
       }
    }


    public V get(K key)
    {


        //buckets.getHash(key);
        Entry<K, V> bucket = buckets[myObj.getHash(key) % getBucketSize()];

        while (bucket != null) {
            if (key == bucket.key) {
                return bucket.value;
            }
            bucket = bucket.next;
        }
        return null;
    }

    public int size() {
        return size;
    }



    private int getBucketSize()
    {
        return buckets.length;
    }



    public static void main(String[] args)
    {
        MyMaps<String,String> myMaps = new MyMaps<>();

        myMaps.put("UK","London");
        myMaps.put("India","New Delhi");
        myMaps.put("Egypt","Cairo");
        myMaps.put("Russia","Moscow");

        myMaps.toString();





    }
}
