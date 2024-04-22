package Challenges;

public class StringBufferExample
{
    public static void main(String[] args)
    {
        StringBuilder stringBuilder = new StringBuilder();
        //stringBuilder.append(" There");

       // stringBuilder.insert(1, " there ");

        //stringBuilder.replace(1, 3," there ");

        //stringBuilder.delete(1,3);

        //stringBuilder.reverse();

        //capacity -> 16 increase the capacity ((oldCapacity * 2) + 2) = 34

        System.out.println(stringBuilder.capacity());

        stringBuilder.append("Hello");

        System.out.println(stringBuilder.capacity());

        stringBuilder.append("hello there how are you doing");

        System.out.println(stringBuilder.capacity());



        stringBuilder.ensureCapacity(10);

        System.out.println(stringBuilder.capacity());

        stringBuilder.ensureCapacity(520);
        System.out.println(stringBuilder.capacity());


    }
}
