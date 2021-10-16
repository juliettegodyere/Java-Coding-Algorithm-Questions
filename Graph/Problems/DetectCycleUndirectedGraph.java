package Graph.Problems;

import java.util.*;
//Question: https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1
//Solution: https://www.geeksforgeeks.org/detect-cycle-undirected-graph/
public class DetectCycleUndirectedGraph {

    // No. of vertices
    // private int V;  
   
    // Adjacency List Representation
    private LinkedList<Integer> adj[];
 
    // Constructor
    DetectCycleUndirectedGraph(int v)
    {
        // V = v;
        adj = new LinkedList[v];
        for(int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
 
    // Function to add an edge
    // into the graph
    void addEdge(int v,int w)
    {
        adj[v].add(w);
        adj[w].add(v);
    }
 
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        Boolean visited[] = new Boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;
 
        // Call the recursive helper
        // function to detect cycle in
        // different DFS trees
        for (int u = 0; u < V; u++){ 
         
            // Don't recur for u if already visited
            if (!visited[u])
                if (isCyclicUtil(u, visited, -1, adj))
                    return true;
        }
 
        return false;
    }
    Boolean isCyclicUtil(int v,Boolean visited[], int parent, ArrayList<ArrayList<Integer>> adj){
        // Mark the current node as visited
        visited[v] = true;
        Integer i;
 
        // Recur for all the vertices
        // adjacent to this vertex
        Iterator<Integer> it = adj.get(v).iterator();
        while (it.hasNext())
        {
            i = it.next();
 
            // If an adjacent is not
            // visited, then recur for that
            // adjacent
            if (!visited[i])
            {
                if (isCyclicUtil(i, visited, v, adj))
                    return true;
            }
 
            // If an adjacent is visited
            // and not parent of current
            // vertex, then there is a cycle.
            else if (i != parent)
                return true;
        }
        return false;
    }
    // Driver method to test above methods
    public static void main(String args[]){
         
        // Create a graph given
        // in the above diagram
        DetectCycleUndirectedGraph g1 = new DetectCycleUndirectedGraph(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 1);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        // if (g1.isCyclic(5, ))
        //     System.out.println("Graph contains cycle");
        // else
        //     System.out.println("Graph doesn't contains cycle");
 
        //     DetectCycleUndirectedGraph g2 = new DetectCycleUndirectedGraph(3);
        // g2.addEdge(0, 1);
        // g2.addEdge(1, 2);
        // if (g2.isCyclic(3, ))
        //     System.out.println("Graph contains cycle");
        // else
        //     System.out.println("Graph doesn't contains cycle");
    }
}
