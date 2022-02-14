package Streaming;

import java.io.*;

public class DataInoutStreamsss
{
    public static void main(String[] args) throws IOException
    {

        InputStream myFile = new FileInputStream("C:\\Users\\pc\\IdeaProjects\\New\\output.txt");

        DataInputStream inputStream = new DataInputStream(myFile);

        int count = inputStream.available();

        byte[] arr = new byte[count];

        inputStream.read(arr);

        for (byte b : arr)
        {
            char k = (char) b;

            System.out.println(k + ",");
        }
    }
}
