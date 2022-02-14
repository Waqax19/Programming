package Streaming;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamsExample
{
    public static void main(String[] args)
    {
        int myData = 15;

        String myData2 = "Hello Moto..";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("file.txt");

            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

            outputStream.writeInt(myData);

            outputStream.writeObject(myData2);

            //read using obj input stream

            FileInputStream fileInputStream = new FileInputStream("file.txt");

            ObjectInputStream objectOutputStream = new ObjectInputStream(fileInputStream);

            System.out.println("Integer data : " + objectOutputStream.readInt());

            System.out.println("String data : " + objectOutputStream.readObject());

            outputStream.close();

            objectOutputStream.close();


        }

        catch (Exception e)
        {
            e.getStackTrace();
        }
    }
}
