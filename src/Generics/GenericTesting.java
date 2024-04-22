package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericTesting<P>
{
    private P t;

    public P getT()
    {
        return t;
    }

    public void setT(P p1)
    {
        this.t = t;
    }


    public static void main(String[] args)
    {

        GenericTesting<String> type = new GenericTesting<String>();

        type.setT("Michael");

        GenericTesting type1 = new GenericTesting();

        type1.setT("David");

        type1.setT(55);




    }
}