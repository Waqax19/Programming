package Misclenious;

public class ObjectToString
{

    public static void main(String[] args)
    {
        Object obj = new String("Hello");

        Class c = obj.getClass();

        System.out.println("Class of object is : "+ c.getName());

    }


}
