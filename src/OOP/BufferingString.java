package OOP;

public class BufferingString
{
    public static void strConcat(String str1)
    {
        str1 = str1 + " okay with just string ";
    }

    public static void bufferSt(StringBuilder str2)
    {
        str2.append("Okay with string builder\n");
    }

    public static void bufferBSt(StringBuffer str3)
    {
        str3.append("Okay with string buffer\n");
    }

    public static void main(String[] args)
    {
        String str1 = "Hello ";

        strConcat(str1);

        System.out.println("the final string is : " + str1);

        StringBuffer stringBuffer = new StringBuffer("Hello!");

        bufferBSt(stringBuffer);

        System.out.println("The final string is : " + stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("Hello\n");

        bufferSt(stringBuilder);

        System.out.println("The string is : " + stringBuilder);

    }
}
