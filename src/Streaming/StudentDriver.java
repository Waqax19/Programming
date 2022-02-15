package Streaming;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentDriver
{
    public static void main(String[] args)
    {
        try {
            /*Stundent stundent = new Stundent(25, "Veeka");

            FileOutputStream outputStream = new FileOutputStream("serializable.txt");

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            objectOutputStream.writeObject(stundent);//serialization is happening here...

            objectOutputStream.flush();

            objectOutputStream.close();

            System.out.println("Success..");*/

            //deserialization


            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("serializable.txt"));

            Stundent stundent = (Stundent) inputStream.readObject();

            System.out.println(stundent.id + " " + stundent.name);

            inputStream.close();

        }

        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
