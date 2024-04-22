package Filing;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class HelloInputStream
{
    //random access file
    static final String filePath = "testing.txt";

    public static void main(String[] args)
    {

        try {
            System.out.println(new String(readFromFile(filePath, 0,18)));

            writeToFile(filePath, "Progrramming is fun and difficult", 31);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static byte[] readFromFile(String filePath, int pos, int size) throws IOException
    {
        RandomAccessFile file = new RandomAccessFile(filePath ,"r");

        file.seek(pos);

        byte[] bytes = new byte[size];

        file.read(bytes);

        file.close();
        return bytes;

    }

    private static void writeToFile(String filePath, String data, int pos) throws IOException
    {
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");

        file.seek(pos);

        file.write(data.getBytes(StandardCharsets.UTF_8));

        file.close();

    }

}
