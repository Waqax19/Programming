package Selections;

public class ComparingString
{
    public static void main(String[] args)
    {
        String name = "hello";

        String name1 = "hello";

        String name3 = "meklo";

        String name4 = "hemlo";

        String name5 = "flag";

        System.out.println(name.compareTo(name1));//0

        System.out.println(name.compareTo(name3));//5

        System.out.println(name.compareTo(name4));//-1

        System.out.println(name.compareTo(name5));//2

        //contain function
        String newName = "My name is Girogio ";

        System.out.println(newName.contains("is"));

        System.out.println(newName.contains("iro"));

        System.out.println(newName.contains("Hello"));

        System.out.println("--------------------------------\n");
        String myString = "JohnAdams";

        System.out.println("Original String : " + myString);

        System.out.println("Substring starting from index 3 " + myString.substring(3));

        System.out.println("Substring starting from index  0 to 3 " + myString.substring(0,3));

        System.out.println("Welcomeo".indexOf('o'));

        //Converting string to int

        System.out.println("Convert string to int ");

        String s = "500";

        int i = Integer.parseInt(s);

        System.out.println(s + 200);//concatenation, adding it into the string

        System.out.println("1 + 3 =  " + (1 + 3));



        System.out.println(name.concat(name3));

        System.out.println(i + 200);//int

    }
}
