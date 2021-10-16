package Graph;

import java.util.*;

//To do a complete DFS traversal of such disconnected graphs, run DFS from all unvisited nodes after a DFS.
//https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/
public class DisconnectedGraph {
    private int V; // No. of vertices
  
    private LinkedList<Integer> adj[];
  
    // Constructor
    DisconnectedGraph(int v){
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }
    void addEdge(int v, int w){
        adj[v].add(w); // Add w to v's list.
    }
  
    void DFSUtil(int v, boolean visited[]){
        visited[v] = true;
        System.out.print(v + " ");
  
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
  
    // The function to do DFS traversal. It uses recursive
    // DFSUtil()
    void DFS(){
        
        boolean visited[] = new boolean[V];
 
        for (int i = 0; i < V; ++i)
            if (visited[i] == false)
                DFSUtil(i, visited);
    }
  
    // Driver Code
    public static void main(String args[])
    {
        DisconnectedGraph g = new DisconnectedGraph(4);
  
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
  
        System.out.println(
            "Following is Depth First Traversal");
  
        g.DFS();
    }
}
