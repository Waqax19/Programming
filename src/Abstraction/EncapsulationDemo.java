package Abstraction;

public class EncapsulationDemo
{
    private String name;
    private int rollNumber;
    private  int age;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getRollNumber()
    {
        return rollNumber;
    }

    public void setRollNumber(int newRollNumber)
    {
        this.rollNumber = newRollNumber;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public static void main(String[] args)
    {
        EncapsulationDemo obj = new EncapsulationDemo();

        obj.setName("Javed");
        obj.setAge(30);
        obj.setRollNumber(55);

        System.out.println("Student name is : " + obj.getName());
        System.out.println("Student age is : " + obj.getAge());
        System.out.println("Student roll number is : " + obj.getRollNumber());
    }
}
