package OOP;

public class Cat
{
    //states and behaviours

    String name;
    String breed;

    int age;

    String color;

    //parameterized constructors
    Cat(String newName, String newBreed, int newAge , String newColor)
    {
        name = newName;

        breed = newBreed;

        age = newAge;

        color = newColor;
    }



    public void running()
    {
        System.out.println("The cat is running..");
        //return 0;
    }

    public String getName()
    {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void nameItAnything()
    {
        System.out.println("Name is : " + getName() + " age is : " + getAge() + " breed is " + getBreed() + " and color is " + getColor() );
    }

    public static void main(String[] args)
    {
        Cat myObject = new Cat("Kitty","Persian",5,"Grey");//built-in constructor, default constructor

        Cat myObject2 = new Cat("coco","Russain",4,"White");
        Cat myObject3 = new Cat("momo","Albanian",3,"Brown");

        myObject.nameItAnything();
        myObject2.nameItAnything();
        myObject3.nameItAnything();





    /*    myObject.setAge(12);

        System.out.println(myObject.getAge());

        myObject.setName("Kitty");

        System.out.println(myObject.getName());


*/





    }
}
