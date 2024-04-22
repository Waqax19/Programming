package Abstraction;

import java.util.Arrays;

public class Person implements Comparable<Person>
{
    String firstName;

    String lastName;

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString()
    {
        return "Person : " + firstName + " " + lastName;
    }

    @Override
    public int compareTo(Person other)
    {
        int lastNameComparison = other.lastName.compareTo(this.lastName);

        if(lastNameComparison != 0)
        {
            return lastNameComparison;
        }

        else
        {
            return other.firstName.compareTo(this.firstName);
        }
    }


    public static void main(String[] args)
    {
        int numPeople = 5;

        Person people[] = new Person[numPeople];

        people[0] = new Person("Alice" , "Jhonson");
        people[1] = new Person("Bob" , "Smith");
        people[2] = new Person("Charlie" , "Brown");
        people[3] = new Person("Alice" , "Smith");
        people[4] = new Person("David" , "Lee");

        Arrays.sort(people);

        System.out.println("Sorted People..");

        printPeople(people);
    }

    public static void printPeople(Person[] people)
    {
        for (Person person : people)
        {
            System.out.println(person);
        }
    }
}