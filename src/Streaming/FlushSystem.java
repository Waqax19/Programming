package Streaming;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class FlushSystem
{
    public static void main(String[] args)
    {
        FileOutputStream outputStream = null;

        String data = "Demo of flush method ... ";

        try {
            outputStream = new FileOutputStream("output.txt");

            outputStream.write(data.getBytes());

            outputStream.flush();

            outputStream.close();
        }

        catch (Exception e)
        {
            e.getStackTrace();
        }

    }
}
