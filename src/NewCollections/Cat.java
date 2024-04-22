package NewCollections;



public class Cat
{
    //Object

    //states and behaviour

    //states
    int age;

    String name;

    String breed;

    String color;

  /* public Cat()
   {
       //default constructor
   }
*/
    public Cat(int newAge, String newBreed, String newName, String newColor)
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

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args)
    {
        //instance object of a class

        Cat myObj = new Cat(5,"Persian","Kitty","Gray");
        System.out.println(myObj.toString());

        Cat myObj1 = new Cat(6,"Russian","KitKat","White");
        System.out.println(myObj1.toString());

        myObj1.setBreed("America");

        System.out.println(myObj1.getBreed());


        Cat myObj2 = new Cat(7,"English","CatCat","Brown");
        System.out.println(myObj2.toString());

    }
}