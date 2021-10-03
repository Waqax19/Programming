package Graphs;

import java.util.LinkedList;

public class WeightedGraph
{
    static class Edge
    {
        int sourceOfGraph;

        int destinationOfGraphs;

        int weightOfGraph;

        public Edge(int source, int destination, int weight)
        {
            this.destinationOfGraphs = destination;
            this.sourceOfGraph = source;
            this.weightOfGraph = weight;
        }
    }


    static class Graph
    {
        int vertices;

        LinkedList<Edge> [] adjacentList;

        Graph(int vertices)
        {
            this.vertices = vertices;
            adjacentList = new LinkedList[vertices];


            for (int i = 0; i < vertices; i++)
            {
                adjacentList[i] = new LinkedList<>();
            }
        }

        public void addEdge(int source, int destination, int weight)
        {
            Edge edge = new Edge(source, destination, weight);

            adjacentList[source].addFirst(edge);
        }

        public void printGraph()
        {
            for (int i = 0; i < vertices; i++)
            {
                LinkedList<Edge> listEdges = adjacentList[i];

                for (int j = 0; j < listEdges.size();j++)
                {
                    System.out.println("Vertex " + i + " is connected to " + listEdges.get(j).destinationOfGraphs

                            + " with weight " + listEdges.get(j).weightOfGraph
                    );
                }
            }
        }
    }


    public static void main(String[] args)
    {
     int vertices = 6;

     Graph myGraph = new Graph(vertices);

        myGraph.addEdge(0,1,3);
        myGraph.addEdge(0,1,4);
        myGraph.addEdge(2,2,8);
        myGraph.addEdge(1,3,6);
        myGraph.addEdge(4,2,9);
        myGraph.addEdge(2,4,2);
        myGraph.addEdge(1,3,7);
        myGraph.addEdge(4,1,1);
        myGraph.printGraph();
    }
}
