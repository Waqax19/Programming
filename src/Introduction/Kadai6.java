package Introduction;


import Hashings.Entry;

import javax.swing.text.html.parser.Entity;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kadai6 {
    public static void main(String[] args) {
        HashMap<String, String> fruits = new HashMap<>();


        fruits.put("apple", "ringo");
        fruits.put("orange", "orenji");
        fruits.put("banana", "banana");

        System.out.println("fruits");
        for (Map.Entry<String, String> entry : fruits.entrySet())
        {
            //for (Map.Entry<String, String> anotherEntry : lang.entrySet())

            String type = entry.getKey();
            String val = entry.getValue();

            System.out.println(type);

            System.out.println(val);
        }
        /*for (String type : fruits) {
            for (String lang : type) {
                System.out.print(lang);
            }*/

        }

    }
