package Abstraction;

public class Demo<T>
{
    T e;

    void add(T e)
    {
        this.e = e;
    }

    T getValue()
    {
        return e;
    }
}
