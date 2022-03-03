package Generics;

import java.util.Arrays;

public class Student implements Comparable<Student>
{
    private String name;
    private int age;
    private String gender;

    public Student(String name, int age, String gender)
    {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public int compareTo(Student o) {
        if(this.age != o.getAge())
        {
            return this.age - o.getAge();
        }

        return this.name.compareTo(o.getName());
    }

    public static void main(String[] args)
    {
        Student[] students = {new Student("Jimmy",54,"male"), new Student("Ali",88,"male")
        ,new Student("Christine",32,"female")
        };

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));

    }
}
