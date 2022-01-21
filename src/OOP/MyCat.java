package OOP;

public class MyCat
{
    //encapsulation

    private int age;

    private String name;

    private String breed;

    private String color;

    MyCat(int newAge, String newName, String newBreed, String newColor)
    {
        age = newAge;
        name = newName;
        breed = newBreed;
        color = newColor;
    }

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

   // @Override
    public String toString()
    {
        return "MyCat{" +
                "age=" + getAge() +
                ", name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }

    public static void main(String[] args)
    {
        MyCat myObj = new MyCat(5,"Kitty","Persian","Grey");

        MyCat myNewCat = new MyCat(2,"Jimmy","Russian","White");

        System.out.println(myObj.getName());

        /*myObj.setName("Cute");

        System.out.println(myObj.getName());
*/


    }
}
