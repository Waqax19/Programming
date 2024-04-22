package Challenges;

import javax.swing.plaf.IconUIResource;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class NewGraphs<T>
{
    private Map<T, List<T> > map = new HashMap<>();

    public void addNewVertex(T s)
    {
        map.put(s, new LinkedList<T>());
    }

    public void addNewEdge(T source, T destination, boolean bidirectional)
    {
        if (!map.containsKey(source))
        {
            addNewVertex(source);
        }


        if (!map.containsKey(destination))
        {
            addNewVertex(destination);
            map.get(source).add(destination);
        }

        if (bidirectional == true)
        {
            map.get(destination).add(source);
        }

    }

    public void countVertices()
    {
        System.out.println("Total number of vertices : " + map.keySet().size());
    }

    public void countEdges(boolean bidirection)
    {
        int count = 0;

        for (T v : map.keySet())
        {
            count = count + map.get(v).size();
        }

        if (bidirection == true)
        {
            count = count / 2;
        }


        System.out.println("Total number of edges : " + count);

    }


    public void containVertex(T s)
    {
        if(map.containsKey(s))
        {
            System.out.println("Graph contains " + s + " as a vertex");
        }

        else
        {
            System.out.println("Graph does not contains " + s + " as a vertex");
        }
    }

    public void containEdges(T s, T d)
    {
        if(map.get(s).contains(d))
        {
            System.out.println("Graph has an edge between " + s + " and " + d);
        }

        else
        {
            System.out.println("Graph has no edge between " + s + " and " + d);
        }
    }


    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        for (T v : map.keySet())
        {
            builder.append(v.toString() + " : ");

            for (T w : map.get(v))
            {
                builder.append(w.toString()+ " ");
            }

            builder.append("\n");
        }

        return (builder.toString());
    }


    public static void main(String[] args)
    {
        NewGraphs myGraph = new NewGraphs();

        myGraph.addNewEdge(0,1,true);
        myGraph.addNewEdge(0,4,true);
        myGraph.addNewEdge(1,2,true);
        myGraph.addNewEdge(1,3,true);
        myGraph.addNewEdge(1,4,true);
        myGraph.addNewEdge(2,3,true);
        myGraph.addNewEdge(3,0,true);


        System.out.println("Adjacency list for the graph : " + myGraph.toString());

        myGraph.countVertices();

        myGraph.countEdges(true);


        myGraph.containEdges(1,3);

        myGraph.containEdges(3,4);

        myGraph.containVertex(3);
        myGraph.containVertex(15);

    }

}
