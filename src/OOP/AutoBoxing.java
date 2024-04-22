package OOP;

import java.math.BigInteger;

public class AutoBoxing
{

    public static void main(String[] args)
    {
        String s1 = "hello";

        String s2 = "hello";

        String s3 = new String("hello");

        System.out.println("s1 == s2 ? : " + (s1 == s2));

        System.out.println("s1 == s3 ? : " + (s1.equals(s3)));
    }

}