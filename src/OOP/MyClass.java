package OOP;

public class MyClass
{
    String color;

    int age = 5;

    String breed;

    String name;

    public void eating()
    {
        System.out.println("Cat is eating...");
    }

    public void sleeping()
    {
        System.out.println("The cat is sleeping ");
    }


    public static void main(String[] args)
    {
        //object, instance variables/object
        MyClass myObj = new MyClass();

        System.out.println(myObj.age);

        myObj.eating();



    }

}
