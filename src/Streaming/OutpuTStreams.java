package Streaming;

import java.io.FileOutputStream;

public class OutpuTStreams
{
    public static void main(String[] args)
    {
        String myText = "this is the line of text we will write in file...";

        try {

            FileOutputStream outputStream = new FileOutputStream("testing.txt");

            byte[] array = myText.getBytes();

            //write the data to the file

            outputStream.write(array);

            outputStream.close();
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }


    }
}
