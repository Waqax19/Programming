package Selections;

public class CharDataType
{
    public static void main(String[] args)
    {
        char myChar1;

        myChar1 = 'R';


        System.out.println("Char1 is " + myChar1);


        myChar1++;

        System.out.println("Char1 is : " + myChar1);


        char ch = (char) 65.55;

        System.out.println(ch);

        int i = (int) 'A';

        System.out.println(i);

        int j = '2' + '3';

        System.out.println("J is : " + j);

        int k = 2 + 'a';
        System.out.println(k);//99

        System.out.println((char)k);

        System.out.println("Chapter" + '2');

        System.out.println(Character.isDigit('c'));//false

        System.out.println(Character.isDigit('5'));//true

        System.out.println("________________________");

        System.out.println(Character.isLetter('d'));
        System.out.println(Character.isLetter('1'));

        System.out.println("________________________");

        System.out.println(Character.isLowerCase('A'));

        System.out.println(Character.isLowerCase('t'));

        System.out.println("________________________");

        System.out.println(Character.toUpperCase('a'));

        System.out.println(Character.toLowerCase('B'));

        System.out.println("________________________");








    }
}
