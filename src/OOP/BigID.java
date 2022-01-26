package OOP;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.regex.Pattern;

public class BigID
{
    public static void main(String[] args)
    {
        String s1 = "hello";

        String s2 = new String("hello");

        String s3 = "hello";

        System.out.println("s1 == s2 is " + (s1.equals(s2)));

        System.out.println("s1 == s3 is " + (s1 == s3));


        System.out.println("***************************************");

        String myString = "com.java.pk";

        System.out.println(myString.replaceAll(".","/"));


        System.out.println("__________________________________________");

        System.out.println("\n");

        System.out.println("Welcome".replace('e','A'));

        System.out.println("Welcome".replaceFirst("e","ABCD"));

        System.out.println("Welcome".replace("el","AB"));

        System.out.println("\n");

        String[] tokens = "Java#HTML#C++".split("#");

        for (int i = 0; i < tokens.length; i++)
        {
            System.out.print(tokens[i] + " ");
        }


        System.out.println("-----------------------------------------------");

        System.out.println("Java".matches("Java"));
        System.out.println("Java".equals("Java"));


        //Conversion between Strings and Arrays

        char[] myChar =  "Java".toCharArray();

        System.out.println(myChar);

        System.out.println(myChar[0]);

        String myStringOne = "helloThere";

        char[] myChar2 = myStringOne.toCharArray();


        for (char c : myChar2)
        {
            System.out.println(c);
        }




        String line = "My name is khan";

        String[] words =  line.split(" ");

        System.out.println(Arrays.toString(words));


        Pattern pattern = Pattern.compile(" ");

        words = pattern.split(line);

        System.out.println(Arrays.toString(words));



    }
}
