package Selections;

public class StringDataType
{
    public static void main(String[] args)
    {
        String myString = "Hello";

        char ch = myString.charAt(0);//index always start from 0
        //the value starts from 1

        System.out.println("Starting character is " + ch);

        int totalLength = myString.length();

        System.out.println("Character at last index is : " + myString.charAt(totalLength - 1));






















        int sizeWithSpaces = myString.length();

        System.out.println("In the string " + "'" + myString+ "");

        myString = myString.replace(" ","");

        int sizeWithoutSpaces = myString.length();

        System.out.println(myString);

        int numOfSpaces = sizeWithSpaces - sizeWithoutSpaces;

        System.out.println("Total number of white spaces : " + numOfSpaces);

    }
}
