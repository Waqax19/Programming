package Streaming;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedIStream
{
    public static void main(String[] args)
    {
        try {
            FileInputStream myFile = new FileInputStream("testing.txt");
            BufferedInputStream inputStream = new BufferedInputStream(myFile);

            int i = inputStream.read();

            while (i != -1)
            {
                System.out.println((char) i);

                i = inputStream.read();//reading next bytes from files


            }

            inputStream.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getStackTrace());
        }

    }
}
