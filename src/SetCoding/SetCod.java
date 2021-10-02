package SetCoding;

import java.io.Serializable;
import java.util.*;

public class SetCod
{
    public static void main(String[] args)
    {

       HashSet<Integer> hashing = new HashSet<Integer>();

        hashing.add(5);
        hashing.add(10);
        hashing.add(15);
        hashing.add(20);
        hashing.add(25);

        System.out.println("Initial list of elements  " + hashing);

       hashing.remove(10);

        System.out.println("Initial list of elements after removal of 10 " + hashing);

        HashSet<Integer> hashing2 = new HashSet<Integer>();
        hashing2.add(10);
        hashing2.add(30);

        hashing.addAll(hashing2);


        System.out.println("list of elements after adding elements from previous collection ");

        System.out.println(hashing);

        hashing.removeAll(hashing2);

        System.out.println("List of elements after removal of elements from hasing2 ");

        System.out.println(hashing);


        hashing.clear();
        System.out.println("After invoking clear funcion " + hashing);




    }
}
