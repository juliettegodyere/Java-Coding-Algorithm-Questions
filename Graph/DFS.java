package Graph;

import java.io.*;
import java.util.*;

//DFS Technique for undirected graph
class DFS {
    private int Vertices; // No. of vertices

    // adjacency list declaration
    private LinkedList<Integer> adj_list[];

    // DFS Constructor: to initialize adjacency lists as per no of vertices
    DFS(int v) {
        Vertices = v;
        adj_list = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj_list[i] = new LinkedList();
    }

    // add an edge to the graph
    void addEdge(int v, int w) {
        adj_list[v].add(w); // Add w to v's list.
    }

    // helper function for DFS technique
    void DFS_helper(int v, boolean visited[]) {
        // current node is visited
        visited[v] = true;
        System.out.print(v + " ");

        // process all adjacent vertices
        Iterator<Integer> i = adj_list[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFS_helper(n, visited);
        }
    }

    void DFSMethod(int v) {
        // initially none of the vertices are visited
        boolean visited[] = new boolean[Vertices];

        // call recursive DFS_helper function for DFS technique
        DFS_helper(v, visited);
    }

    public static void main(String args[]) {
        // create a DFS object and add edges to it
        DFS g = new DFS(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(2, 4);
        // print the DFS Traversal sequence
        System.out.println("Depth First Traversal for given graph" + "(with 0 as starting vertex)");
        g.DFSMethod(0);
    }
}
