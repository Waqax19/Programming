import java.util.ArrayList;
import java.util.Vector;

public class VectorsExplained
{
    public static void main(String[] args)
    {
        Vector myVec = new Vector();

        int size = myVec.size();

        System.out.println("Size of the vector before adding the elemetns " + size);

        myVec.add("Ali");
        myVec.add("Qasim");
        myVec.add("Shah");
        myVec.add("Ubaid");

        myVec.add(25);

        System.out.println("Vector elements : " + myVec);


        int newSize = myVec.size();

        System.out.println("Updated size is : " + newSize);

        int vect_capacity = myVec.capacity();

        System.out.println("Default capacity " + vect_capacity);

        myVec.addElement(null);

        myVec.addElement(25);
        myVec.addElement(96);

        myVec.addElement("Hello");

        myVec.addElement("There");


        myVec.add(4,75);

        System.out.println("Vector elements : " + myVec);

         newSize = myVec.size();

        System.out.println("Updated size is : " + newSize);

         vect_capacity = myVec.capacity();

        System.out.println("Latest capacity " + vect_capacity);


        System.out.println("\nArrayList");

        ArrayList myList = new ArrayList();

        myList.add("Dasha");
        myList.add("Veeka");


        myList.add("Three");
        myList.add("Four");

        myList.add("FIve");
        myList.add("six");

      //  myList.add("seven");
        myList.add("eight");

        myList.add("ten");
        myList.add("nine");
        myVec.addAll(myList);

        System.out.println("New Vector list is : " + myVec);


        newSize = myVec.size();

        System.out.println("Updated size is : " + newSize);

        vect_capacity = myVec.capacity();

        System.out.println("Latest capacity " + vect_capacity);


        myVec.clear();


        newSize = myVec.size();

        System.out.println("Vector is : "+ myVec);

        System.out.println("Updated size is : " + newSize);

        vect_capacity = myVec.capacity();

        System.out.println("Latest capacity " + vect_capacity);





    }
}
