package Misclenious;

import java.util.Scanner;

public class Quadratic
{
 /*
A word is said to be “abecedarian” if the letters in the



word appear in alphabetical order. For example, the following are all six-letter English abecedarian words:

abdest, acknow, acorsy, adempt, adipsy, agnosy, befist,
 behint, beknow, bijoux, biopsy, cestuy, chintz, deflux, dehors, dehort, deinos, diluvy, dimpsy
Write a method called isAbecedarian that takes a String and returns a
 boolean indicating whether the word is abecedarian.


  */

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a string ");

        String s = userInput.nextLine();

        System.out.println(isAbecedarian(s));

    }


    public static boolean isAbecedarian(String s)
    {
        int index = 0;

        char c = 'a';


        while (index < s.length())
        {
            if (c > s.charAt(index))
                return false;

            c =  s.charAt(index);

            index = index + 1;
        }

        return true;
    }

}
