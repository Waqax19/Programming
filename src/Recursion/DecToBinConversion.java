package Recursion;

import java.util.Scanner;

public class DecToBinConversion
{

    public static byte[] toBinary(int number)
    {
        byte[] binary = new byte[32];

        int index = 0;

        int copyOfInput = number;

        while (copyOfInput > 0)
        {
            binary[index++] = (byte) (copyOfInput % 2);

            copyOfInput = copyOfInput / 2;
        }
        return binary;
    }


    public static void printBinary(byte[] binary)
    {
        for (int i = binary.length - 1; i >= 0; i--)
        {
            System.out.println(binary[i]);
        }
    }


    public static void convert(int input)
    {
        int copyOfInput = input;

        StringBuilder stringBuilder = new StringBuilder();

        while (copyOfInput > 0)
        {
            byte bit = (byte) (copyOfInput % 2);

            stringBuilder.append(bit);

            copyOfInput = copyOfInput / 2;

        }


        System.out.printf("\nDecinal number %d in Binary format is %s %n", input, stringBuilder.toString());
    }


    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        int number = Integer.MAX_VALUE;

        while (number != 0)
        {
            System.out.println("Enter a decimal number to convert into binary : ");

            number = userInput.nextInt();

            byte[] bits = toBinary(number);

            printBinary(bits);

            convert(number);
        }

        userInput.close();
    }



}
