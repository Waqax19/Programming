package Challenges;

public class Student
{
    private String name;
    private int id;


    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args)
    {
        Student myObj = new Student("veeka", 74);

        myObj.setName("David");

        //System.out.println(myObj.getName());

        System.out.println( myObj.toString());

    }
}
