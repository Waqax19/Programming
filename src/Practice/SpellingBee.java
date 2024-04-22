package Practice;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SpellingBee {

    public SpellingBee() {
        // TODO Auto-generated constructor stub
    }



    static void printPermutn(String str, String ans,BufferedWriter output) throws IOException
    {

        // If string is empty
        if (str.length() == 0) {
            //System.out.print(ans + " ");
            output.write(ans+"\n");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recursive call
            printPermutn(ros, ans + ch,output);
        }
    }

    public static void main(String[] args) throws IOException {
        String s=args[0];

        int n=7;

        System.out.print("\n Abdullah Anees*** ");



        FileWriter file1 = new FileWriter("tale.txt");
        BufferedWriter output = new BufferedWriter(file1);


        int r=4;
        char data[]=new char[4];
        printPermutn(s, "",output);
        output.close();


        String fileName="tale.txt";

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;


        int iter=0;
        while ((line = br.readLine()) != null) {

            iter++;
        }
        int size=iter;
        String[] arr = new String[size];

        System.out.print("Number of words in file: "+size);
        BufferedReader br1 = new BufferedReader(new FileReader(fileName));


        iter=0;
        while ((line = br1.readLine()) != null) {
            arr[iter]=line;
            iter++;
        }
        System.out.print("\n Printing all words in file: ");
        for (int i=0;i<arr.length;i++) {
            System.out.print("\n "+arr[i]);
        }

        System.out.print("\n Printing the count of words which have only those letters present in the command line argument:"+ size);




    }

}
