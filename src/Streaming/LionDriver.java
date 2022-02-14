package Streaming;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LionDriver
{
    public static void main(String[] args)
    {
        Lion myLion = new Lion("Brian","White Lion");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("lion.txt");

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(myLion);

            FileInputStream fileInputStream = new FileInputStream("lion.txt");

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Lion myLion2 = (Lion) objectInputStream.readObject();

            System.out.println("Lion name is : " + myLion2.name);

            System.out.println("Lion breed is : " + myLion2.breed);

            objectOutputStream.close();

            objectInputStream.close();


        }

        catch (Exception e)
        {
            e.getStackTrace();
        }

    }
}