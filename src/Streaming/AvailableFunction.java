package Streaming;

import java.io.FileInputStream;

public class AvailableFunction
{
    public static void main(String[] args)
    {

        try {
            FileInputStream inputStream = new FileInputStream("input.txt");

            System.out.println("Available bytes in the beginning " + inputStream.available());

            //read 4 bytes from the file

            inputStream.read();
            inputStream.read();
            inputStream.read();
            inputStream.read();

            //return updated number of bytes

            System.out.println("Available bytes in the beginning " + inputStream.available());

            inputStream.close();
        }

        catch (Exception e)
        {
            e.getStackTrace();
        }
    }
}