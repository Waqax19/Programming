package Challenges;

import java.util.Arrays;

public class MinimumSpanningTree
{
    public void Prim(int graph[][] , int vertex)
    {
        int value = 999999;

        int num_of_edges;

        boolean[] selected = new boolean[vertex];

        Arrays.fill(selected, false);

        num_of_edges = 0;

        selected[0] = true;

        System.out.println("Edge :  Tree ");

        while (num_of_edges < vertex - 1)
        {
            int min = value;

            int x = 0;//row
            int y = 0;//col

            for (int i = 0; i < vertex; i++)
            {
                if (selected[i]  == true)
                {
                    for (int j = 0; j < vertex; j++)
                    {
                        if (!selected[j] && graph[i][j] != 0)
                        {
                            if(min > graph[i][j])
                            {
                                min = graph[i][j];

                                x = i;
                                y = j;
                            }
                        }
                    }
                }
            }

            System.out.println(x + " - " + y + " : " + graph[x][y]);

            selected[y] = true;

            num_of_edges++;
        }
    }


    public static void main(String[] args)
    {
        MinimumSpanningTree minimumSpanningTree = new MinimumSpanningTree();

        int V = 5;

        int[][] graph = {{0,9,75,0,0}, {9,0,25,75,14}, {75,0,0,85,14},{95,75,88,22,65},{0,42,66,31,0}};

        minimumSpanningTree.Prim(graph,V);

    }

}
