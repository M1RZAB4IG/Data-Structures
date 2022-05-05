/Mirza Baig
//CS2720

import java.io.*;
import java.util.*;
import java.util.LinkedList;
 
//class to store edges of  graph
class Edge {
    int source, destination, weight;
    
    Edge(int weight, int destination, int source) {
    		this.weight = weight;    
            this.destination = destination;
            this.source = source;
        }
}

// partner file 1

mport java.io.*;
import java.util.*;
import java.util.LinkedList;
 
class Graph {
    // node of adjacency list 
    static class Node {
        int value, weight;
        Node(int value, int weight)  {
            this.value = value;
            this.weight = weight;
        }
    };
List<List<Node>> adj_list = new ArrayList<>();
 
//print list for graph
public static void printGraph(Graph graph)  {
    int source_vertex = 0;
    int list_size = graph.adj_list.size();

    System.out.println("Graph:");
    while (source_vertex < list_size) {
        //traverse through the adjacency list and print the edges
        for (Node edge : graph.adj_list.get(source_vertex)) {
            System.out.print("Vertex:" + source_vertex + " ==> " + edge.value + 
                            " (" + edge.weight + ")\t");
        }
        System.out.println();
        source_vertex++;
    }
}
    //Graph Constructor
    public Graph(List<Edge> edge)
    {
        // adjacency list memory allocation
        for (int a = 0; a < edge.size(); a++)
            adj_list.add(a, new ArrayList<>());
 
        // add edges to graph
        for (Edge ed: edge)
        {
            // allocate new node in adjacency List from source to destination
            adj_list.get(ed.source).add(new Node(ed.destination, ed.weight));
        }
    }
}

// partner file 2


import java.io.*;
import java.util.*;
import java.util.LinkedList;
 
class Main{
    public static void main (String[] args) {
        // define edges 
        List<Edge> edge = Arrays.asList(new Edge(0, 1, 2),new Edge(0, 2, 4),
                   new Edge(1, 2, 4),new Edge(2, 0, 5), new Edge(2, 1, 4),
                   new Edge(3, 2, 3), new Edge(4, 5, 1),new Edge(5, 4, 3));
 
        // call graph to construct 
        Graph graph = new Graph(edge);
 
        // print the graph as list
        Graph.printGraph(graph);
    }
}
