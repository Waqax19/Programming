package Hashings;

public class MyMap<K,V>
{
    final K key;

    V value;

    MyMap<K,V> next;

    /*public MyMap()
    {

    }*/

    public MyMap(K key, V value, MyMap<K,V> next)
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

    public MyMap<K, V> getNext() {
        return next;
    }

    public void setNext(MyMap<K, V> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "MyMap{" +
                "key=" + key +
                ", value=" + value +
                ", next=" + next +
                '}';
    }
}
