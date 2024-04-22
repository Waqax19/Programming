package Challenges;

import java.util.LinkedList;

public class WeightGraph
{

    static class Edge
    {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight)
        {
            this.source = source;

            this.weight = weight;

            this.destination = destination;
        }
    }


    static class Graphss
    {
        int vertices;

         LinkedList<Edge>[] adjacencyList;

        Graphss(int vertices)
        {
            this.vertices = vertices;

            adjacencyList = new LinkedList[vertices];


            for (int i = 0; i < vertices; i++)
            {
                adjacencyList[i] = new LinkedList<>();
            }
        }


        public void addEdge(int source, int destination, int weight)
        {
            Edge edge = new Edge(source, destination, weight);
            adjacencyList[source].addFirst(edge);


        }


        public void printGraph()
        {
            for (int i = 0; i < vertices; i++)
            {
                LinkedList<Edge> linkedList = adjacencyList[i];

                for (int j = 0; j < linkedList.size();j++)
                {
                    System.out.println("Vetex  -  " + i + " is connected to " + linkedList.get(j).destination + " with weight " + linkedList.get(j).weight);
                }
            }
        }
    }




    public static void main(String[] args)
    {
            int vertices = 6;

        Graphss graph = new Graphss(vertices);

        graph.addEdge(0,1,4);
        graph.addEdge(0,1,4);
        graph.addEdge(1,3,2);
        graph.addEdge(2,3,7);
        graph.addEdge(4,0,4);
        graph.addEdge(4,5,6);
        graph.addEdge(4,1,4);

        graph.printGraph();
    }
}
