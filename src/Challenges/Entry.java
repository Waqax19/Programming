package Challenges;

import java.util.Objects;

public class Entry<K, V>
{

    final K key;
    public V value;

   public Entry<K, V> next;

    public Entry(K key, V value, Entry<K, V> next)
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

    public Entry<K, V> getNext() {
        return next;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Entry<?, ?> that = (Entry<?, ?>) o;

        return Objects.equals(key, that.key) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}
