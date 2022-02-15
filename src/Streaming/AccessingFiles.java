package Streaming;

import java.io.IOException;
import java.io.RandomAccessFile;

public class AccessingFiles
{
    static final String pathOfFile = "file.txt";

    public static void main(String[] args)
    {
        try {
            System.out.println(new String(readFromFile(pathOfFile, 0,18)));

            writeToFile(pathOfFile,"lion is king of jungle..", 35);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }


    private static byte[] readFromFile(String filePath, int position, int size) throws IOException
    {
        RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "r");//r stand for read

        randomAccessFile.seek(position);

        byte[] bytes = new byte[size];

        randomAccessFile.read(bytes);

        randomAccessFile.close();

        return bytes;

    }

    private static void writeToFile(String pathOfFile, String data, int position) throws IOException
    {
        RandomAccessFile file = new RandomAccessFile(pathOfFile , "rw");

        file.seek(position);

        file.write(data.getBytes());

        file.close();
    }
}
