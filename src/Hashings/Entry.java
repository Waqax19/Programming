/*
package Hashings;

public class Entry<K,V>
{
    public final K key;

    public V value;

    public Entry<K,V> next;

    */
/*public MyMap()
    {

    }*//*

    public Entry(K key, V value, Entry<K,V> next)
    {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Entry<K, V> getNext() {
        return next;
    }

    public int getHash(K key)
    {
        return key == null ? 0 : Math.abs(key.hashCode());
    }

    public boolean equals(Object obj)
    {
        if(obj == this)
        {
            return true;
        }

        if (obj instanceof Entry)
        {
            Entry entry = (Entry) obj;

            return key.equals(entry.getKey()) && value.equals(entry.getValue());

        }
        return false;
    }

    @Override
    public int hashCode()
    {
        int hash = 13;

        hash = 17 * hash + ((key == null) ? 0 : key.hashCode());

        hash = 17 * hash + ((value == null) ? 0 : value.hashCode());

        return hash;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "key=" + key +
                ", value=" + value +
                ", next=" + next +
                '}';
    }
}
*/
