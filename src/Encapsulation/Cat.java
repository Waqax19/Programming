package Encapsulation;

public class Cat
{
    private int age;

    private String name;

    private String breed;

    private String color;

    //parameterized Constructors
    public Cat(int newAge, String newName, String newBreed, String newColor)
    {
        age = newAge;

        name = newName;

        breed = newBreed;

        color = newColor;
    }

    //getters and setters


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "age=" + getAge() +
                ", name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }


    public static void main(String[] args)
    {
        Cat myCat = new Cat(5 , "Kitty", "Persian","Gray");

        System.out.println(myCat.toString());

        Cat myCat2 = new Cat(15,"Kitten","Russian","White");

        System.out.println(myCat2.toString());

    }
}
