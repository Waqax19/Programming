package Inheritance;

public class Student
{
    int rollNumber;

    String name;

    String city;


    Student(int rollNumber, String name , String city)
    {
        this.rollNumber = rollNumber;
        this.city = city;
        this.name = name;
    }

/*    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }*/

    public static void main(String[] args)
    {
        Student s1 = new Student(505, "David","Cairo");
        Student s2 = new Student(98, "Ali","Rome");

        System.out.println(s1);

        System.out.println(s2);

    }

}
