package Streaming;

import java.io.Serializable;

public class Lion implements Serializable
{
    String name;

    String breed;

    public Lion(String name, String breed)
    {
        this.breed = breed;

        this.name = name;
    }


}
