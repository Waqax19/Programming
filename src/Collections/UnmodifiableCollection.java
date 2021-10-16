package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableCollection
{
    private List<Integer> myList = new ArrayList<>();

    public void addValueInList(Integer val)
    {
        myList.add(val);
    }
    public List<Integer> getIntList()
    {
        return Collections.unmodifiableList(myList);
    }
    public static void main(String[] args)
    {
        UnmodifiableCollection unmodifiableCollection = new UnmodifiableCollection();
        unmodifiableCollection.addValueInList(55);

        List<Integer> list = unmodifiableCollection.getIntList();

        list.add(88);
    }
}
