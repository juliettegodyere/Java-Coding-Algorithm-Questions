package Graph;

import java.io.*;
import java.util.*;

//undirected graph represented using adjacency list.  
class BFS {
    private int Vertices; // No. of vertices
    private LinkedList<Integer> adj_list[]; // Adjacency Lists

    // graph Constructor:number of vertices in graph are passed
    BFS(int v) {
        Vertices = v;
        adj_list = new LinkedList[v];
        for (int i = 0; i < v; ++i) // create adjacency lists
            adj_list[i] = new LinkedList();
    }

    // add an edge to the graph
    void addEdge(int v, int w) {
        adj_list[v].add(w);
    }

    void BFSMethod(int root_node) {
        boolean visited[] = new boolean[Vertices];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[root_node] = true;
        queue.add(root_node);

        while (queue.size() != 0) {
            root_node = queue.poll();
            System.out.print(root_node + " ");

            for (int i = 0; i < adj_list[root_node].size(); i++)  //iterate through the linked list and push all neighbors into queue
            {
                int n = adj_list[root_node].get(i);
                if (!visited[n])                    //only insert nodes into queue if they have not been explored already
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }  
        }
    }

    public static void main(String args[]) {
        // create a graph with 5 vertices
        BFS g = new BFS(5);
        // add edges to the graph
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(2, 4);
        // print BFS sequence
        System.out.println("Breadth-first traversal of graph with 0 as starting vertex:");
        g.BFSMethod(0);
    }
}