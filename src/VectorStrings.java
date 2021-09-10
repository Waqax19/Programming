import java.util.Vector;

public class VectorStrings
{
    public static void main(String[] args)
    {
        Vector<String> myVec = new Vector<String>();

        myVec.add("A");
        myVec.add("B");
        myVec.add("C");
        myVec.add("D");
        myVec.add("E");


        System.out.println("Elements : " + myVec);

        String firstElem = myVec.firstElement();

        System.out.println("First element : " + firstElem);

        String lastElem = myVec.lastElement();

        System.out.println("Last element : " + lastElem);

        boolean checkElem = myVec.contains("F");

        System.out.println("Element checking , is there ? " + checkElem);


        String[] myArray = new String[5];

        myVec.copyInto(myArray);

        System.out.println("Elements in the array are : ");

        for (String st: myArray)
        {
            System.out.println(st);
        }


        System.out.println();
        //create clone of the vector

        Object myObj = myVec.clone();

        System.out.println("Clone is : " + myObj);







    }

}
