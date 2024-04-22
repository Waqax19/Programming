package Abstraction;

public class Container<T>
{
    private T contents;

    public Container(T contents)
    {
        this.contents = contents;
    }

    public T getContents()
    {
        return contents;
    }

    public static void main(String[] args)
    {
        Container<String> container = new Container<>("Hello!!");

        String contents = container.getContents();

        System.out.println(contents);

    }
}