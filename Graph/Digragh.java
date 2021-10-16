// package Graph;

// import java.util.*;

// class Node {
//     String label;

//     Node(String city) {
//         this.label = city;
//     }
//     public String toString() { 
//         return label;
//     } 

//     // equals and hashCode
// }
// class Edge {
//     int src, dest;
//     Edge(int src, int dest) {
//             this.src = src;
//             this.dest = dest;
//         }
// }

// public class Digragh {
//     private Map<Node, List<Node>> adjVertices = new HashMap<>();

//     Digragh(List<Edge> edges){
//         for (int i = 0; i < edges.size(); i++)
//         adjVertices.put(new Node(edges[i].src), new ArrayList<>());
 
//         // add edges to the graph
//         for (Edge e : edges){
//             // allocate new node in adjacency List from src to dest
//             adj_list.get(e.src).add(new Node(e.dest, e.weight));
//         }
//     }

//     void addVertex(String label) {
//         System.out.println("Node added");
//         adjVertices.putIfAbsent(new Node(label), new ArrayList<>());            
//     }
//     void removeVertex(String label) {
//         Node v = new Node(label);
//         adjVertices.values().stream().forEach(e -> e.remove(v));
//         adjVertices.remove(new Node(label));
//     }

//     void addEdge(String label1, String label2) {
//         System.out.println("Edge added");
//         Node v1 = new Node(label1);
//         Node v2 = new Node(label2);
//         adjVertices.get(v1).add(v2);
//         adjVertices.get(v2).add(v1);
//     }

//     void removeEdge(String label1, String label2) {
//         Node v1 = new Node(label1);
//         Node v2 = new Node(label2);
//         List<Node> eV1 = adjVertices.get(v1);
//         List<Node> eV2 = adjVertices.get(v2);
//         if (eV1 != null)
//             eV1.remove(v2);
//         if (eV2 != null)
//             eV2.remove(v1);
//     }

//     static void printGraph(Map<Node, List<Node>> adj) {
//         for (Map.Entry<Node, List<Node>> entry : adj.entrySet()) {
//             Node node = entry.getKey();
//             System.out.print(node + "=>" );
//             for(Node edges: entry.getValue()){
//                 System.out.print(edges);
//             }
//             System.out.println();
//         }
    
//     }
//     public static void main(String[] args) {
//         // Digragh graph = new Digragh();
//         // graph.addVertex("Bob");
//         // graph.addVertex("Alice");
//         // graph.addVertex("Mark");
//         // graph.addVertex("Rob");
//         // graph.addVertex("Maria");
//         // graph.addEdge("Bob", "Alice");
//         // graph.addEdge("Bob", "Rob");
//         // graph.addEdge("Alice", "Mark");
//         // graph.addEdge("Rob", "Mark");
//         // graph.addEdge("Alice", "Maria");
//         // graph.addEdge("Rob", "Maria");

//         // for (Map.Entry<Node, List<Node>> entry : graph.adjVertices.entrySet()) {
//         //     System.out.println("hhyeyeyyeyye");
//         //     Node node = entry.getKey();
//         //     System.out.print(node + "=>" );
//         //     for(Node edges: entry.getValue()){
//         //         System.out.print(edges);
//         //     }
//         //     System.out.println();
//         // }

//     }
// }
