package LIstss;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AlToLL
{
    public static void main(String[] args)
    {
        List<String> arrList = Arrays.asList("Jacob","Kate","Loujain","Shanza");

        System.out.println("ArrayList = " + arrList);

        List<String> myList = arrList.stream().collect(Collectors.toCollection(LinkedList::new));

        System.out.println("LinkedList (AL to LL ) : " + myList);
    }
}
