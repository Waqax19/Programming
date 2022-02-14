package Streaming;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStreamClass
{
    public static void main(String[] args) throws IOException
    {
        File myFile = new File("C:\\Users\\pc\\IdeaProjects\\New\\output.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(myFile);

        FilterOutputStream filterOutputStream = new FilterOutputStream(fileOutputStream);

        String s = "Filing the filters .. ";

        byte[] bytes = s.getBytes();

        filterOutputStream.write(bytes);

        filterOutputStream.flush();

        filterOutputStream.close();

        fileOutputStream.close();

        System.out.println("Sucessss...");



    }
}
