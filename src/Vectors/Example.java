package Vectors;

import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Vector;

public class Example
{
    public static void main(String[] args)
    {
        Vector<String> mammals = new Vector<>();

        mammals.add("Cow");
        mammals.add("Horse");
        mammals.add("Bitch");


        String elem = mammals.remove(2);

        System.out.println("Removed element " + elem);

        System.out.println("New Vector : " + mammals);

        mammals.clear();
        System.out.println("Vector after clear() " + mammals);



      /*  String elem = mammals.get(1);

        System.out.println("Element at index 1 : " + elem);

        Iterator<String> iterator = mammals.iterator();

        System.out.println("Vector : ");

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());

            System.out.println(" , ");
        }
*/
        /*//using index number
        mammals.add(2,"Cat");

        System.out.println("Vector " + mammals);

        //using addAll
        Vector<String> animals = new Vector<>();

        animals.add("Crocodile");
        animals.add("Pigs");
        animals.add("Lioness");
        animals.add("PigFemale");

        animals.addAll(mammals);

        System.out.println("New Vector : " + animals);

*/




    }
}
