package Recursion;

import java.io.File;
import java.util.Scanner;

public class FindDirSize
{
    public static void main(String[] args)
    {
        System.out.println("Enter a directory or file ");

        Scanner userInput = new Scanner(System.in);

        String dir = userInput.nextLine();


        System.out.println(getSize(new File(dir)) + " bytes");

    }


    public static long getSize(File file)
    {
        long size = 0;

        if(file.isDirectory())
        {
            File[] files = file.listFiles();

            for (int i = 0; files != null && i < files.length; i++)
            {
                size += getSize(files[i]);
            }
        }

        else
        {
            size += file.length();
        }

        return size;
    }
}
