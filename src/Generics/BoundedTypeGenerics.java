package Generics;

public class BoundedTypeGenerics <T extends Number>
{
    T data;

    BoundedTypeGenerics(T data)
    {
        this.data = data;
    }

    public void display()
    {
        System.out.println("Data value is : " + this.data);
    }

    public static void main(String[] args)
    {
        BoundedTypeGenerics<Integer> i = new BoundedTypeGenerics<Integer>(50);
        i.display();

        BoundedTypeGenerics<Double> obj2 = new BoundedTypeGenerics<Double>(50.55d);
        obj2.display();

        BoundedTypeGenerics<Float> obj3 = new BoundedTypeGenerics<Float>(55.4545f);
        obj3.display();

        /*BoundedTypeGenerics<String> obj4 = new BoundedTypeGenerics<String>("Helo");
        obj3.display();*/


    }

}
