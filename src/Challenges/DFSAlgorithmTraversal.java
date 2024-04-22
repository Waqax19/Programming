package Challenges;

import Arrayss.GradingScores;

import java.util.Iterator;
import java.util.LinkedList;

public class DFSAlgorithmTraversal
{
    private LinkedList<Integer> adjacentList[];

    public int visited;


    DFSAlgorithmTraversal(int  vertices)
    {
        adjacentList = new LinkedList[vertices];

       visited = vertices;

        for (int i = 0; i < vertices; i++)
        {
            adjacentList[i] = new LinkedList<Integer>();
        }

    }


    private void addEdge(int source, int destination)
    {
        adjacentList[source].add(destination);
    }

    void DFS_Traversal(int vertex)
    {
        boolean visit[] = new boolean[visited];

        LinkedList<Integer> queue = new LinkedList<>();

        visit[vertex] = true;
        queue.add(vertex);

        while (queue.size() != 0)
        {
            vertex = queue.poll();
            System.out.println(vertex + " ");

            Iterator<Integer> iterator = adjacentList[vertex].listIterator();


            while (iterator.hasNext())
            {
                int n = iterator.next();

                if (!visit[n])
                {
                    visit[n] = true;

                    queue.add(n);
                }
            }
        }

    }

    public static void main(String[] args)
    {
        DFSAlgorithmTraversal dfsAlgorithmTraversal = new DFSAlgorithmTraversal(5);

        dfsAlgorithmTraversal.addEdge(0,1);
        dfsAlgorithmTraversal.addEdge(0,2);

        dfsAlgorithmTraversal.addEdge(1,2);
        dfsAlgorithmTraversal.addEdge(2,0);
        dfsAlgorithmTraversal.addEdge(2,3);
        dfsAlgorithmTraversal.addEdge(3,3);
        dfsAlgorithmTraversal.addEdge(3,4);

        System.out.println("This is DFS traversal ");
        dfsAlgorithmTraversal.DFS_Traversal(0);

    }


}
