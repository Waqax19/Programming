package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableCollection
{

    public static void main(String[] args)
    {

    }

    public static int linearSearch(int[] list , int key)
    {
        for (int i = 0; i < list.length; i++)
        {
            if (key == list[i])
                return i;
        }
        return -1;
    }
}
