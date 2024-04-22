package NewCollections;

import java.util.Vector;

public class Mammals
{
    public static void main(String[] args)
    {
        Vector<String> mammals = new Vector<>();

        //use the add method
        mammals.add("Cow");
        mammals.add("Sheep");
        mammals.add("Goat");
        mammals.add("Bitch");

        //access elements
        String element = mammals.get(2);
        System.out.println("Element at index 2 is : " + element);

        //using remove
        String el = mammals.remove(1);
        System.out.println("The removed Vector is : " + el);

        //using index numbers
        mammals.add(2,"Cat");

        System.out.println("Vector : " + mammals);

        //using addAll
        Vector<String> animals = new Vector<>();

        animals.add("Crocodile");

        animals.addAll(mammals);

        System.out.println("New Vector :  "+ animals);

    }
}