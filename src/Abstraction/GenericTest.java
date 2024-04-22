package Abstraction;

public class GenericTest
{
    public static void main(String[] args)
    {
        //case 1
        Demo<Integer> d1 = new Demo<Integer>();

        d1.add(10);

        Integer i = d1.getValue();

        System.out.println("i = " + i);

        //case 2
        Demo<String> d2 = new Demo<String>();

        d2.add("abcdef");

        String str = d2.getValue();

        System.out.println("str : " + str);


        //case 3
        Demo d3 = new Demo();
        d3.add(10);

        Integer i1 = (Integer) d3.getValue();

        System.out.println("i1 : " + i1);

        d3.add("abcd");

        String str1 = (String) d3.getValue();

        System.out.println("Str1 : " + str1);
    }
}
