package SetCoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intro
{
    public static void main(String[] args)
    {
        Set<Integer> hash = new HashSet<Integer>();

        hash.addAll(Arrays.asList(new Integer[]{1,2,3,4,8,9,0,5}));

        Set<Integer> hashTwo = new HashSet<Integer>();

        hashTwo.addAll(Arrays.asList(new Integer[]{1,3,5,7,9,0,5}));

        //to find union
        Set<Integer> union = new HashSet<Integer>(hash);

        union.addAll(hashTwo);

        System.out.println("Union of two sets ");
        System.out.println(union);


        Set<Integer> intersection = new HashSet<Integer>(hash);

        intersection.retainAll(hashTwo);

        System.out.println("Intersection of two sets ");
        System.out.println(intersection);

        //to find the difference
        Set<Integer> difference = new HashSet<Integer>(hash);

        difference.removeAll(hashTwo);

        System.out.println("Difference of two sets ");
        System.out.println(difference);




    }
}
