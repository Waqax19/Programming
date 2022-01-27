package Inheritance;

public class Pet
{
    String name;
    Integer age;

    Pet(String name, Integer age)
    {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args)
    {
        Pet myObj = new Pet("Lion", 5);

        System.out.println(myObj.toString());

        System.out.println(Integer.toString(12));



        Integer x = 15;

        Integer y  = 25;

        System.out.println((x.toString() + y.toString()));

       // System.out.println(result.toString());

      /*  System.out.println(x.toString());

        System.out.println(y.toString());*/


        System.out.println(Integer.toString(12));

    }
}
