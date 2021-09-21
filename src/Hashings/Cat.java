package Hashings;

public class Cat
{
    //state and behaviour

    private String name;//

    private int age;

    private String color;

    private String breed;

    //constructor

    public Cat(String newName, int newAge, String newColor, String newBreed)
    {
        this.age = newAge;

        this.breed = newBreed;

        this.color = newColor;

        this.name = newName;


    }

    //encapsulation


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", color='" + getColor() + '\'' +
                ", breed='" + getBreed() + '\'' +
                '}';
    }


    public static void main(String[] args)
    {
        Cat myCat = new Cat("Kitty",5,"Gray","Russian");

       // myCat.toString();

        System.out.println(myCat.toString());

        Cat myOtherCat = new Cat("Maano",4,"White","Persian");

        System.out.println(myOtherCat.toString());


    }
}
