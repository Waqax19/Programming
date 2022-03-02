package Generics;

public class GenericClass<E>
{
    private E data;

    public GenericClass(E data)
    {
        this.data = data;
    }

    public E getData()
    {
        return this.data;
    }

    public static void main(String[] args)
    {
        GenericClass<Integer> intObj = new GenericClass<>(55);

        System.out.println("Generic class returns : " + intObj.getData());

        GenericClass<String> stringObj = new GenericClass<>("Program");

        System.out.println("Generic class returns " + stringObj.getData());

    }
}
