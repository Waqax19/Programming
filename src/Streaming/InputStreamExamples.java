package Streaming;

import java.io.FileInputStream;

public class InputStreamExamples
{
    public static void main(String[] args)
    {
        try {


        FileInputStream inputStream = new FileInputStream("input.txt");

        System.out.println("This is the data in the file .... ");

        int i = inputStream.read();

        while (i != -1)
        {
            System.out.println((char) i);

            i = inputStream.read();
        }

        inputStream.close();

    }
        catch (Exception e)
        {
            e.getStackTrace();
        }
    }
}