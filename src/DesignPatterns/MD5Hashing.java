package DesignPatterns;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Hashtable;

public class MD5Hashing
{

    public static void main(String[] args)
    {
        Hashtable<Integer , String> hashtable = new Hashtable<Integer, String>();

        hashtable.put(3,"Hello");
        hashtable.put(7,"Angelo");
        hashtable.put(2,"Java");
        hashtable.put(1,"Program");

        System.out.println(hashtable);

    }
}
