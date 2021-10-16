package Trees;

import java.util.*;

//Write a Program to Find the Maximum Depth or Height of a Tree https://www.geeksforgeeks.org/write-a-c-program-to-find-the-maximum-depth-or-height-of-a-tree/
//https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1

public class HeightBT {
    Node root;
    int treeHeightRecursive(Node node) {
        // code here 
        int maxhight = 0;
        if(node != null){
            maxhight = Math.max(treeHeightRecursive(node.left), treeHeightRecursive(node.right));
            return maxhight + 1;
        }
        return maxhight;
    }

    int treeHeightIterative(Node node) {
        // code here 
        
        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        int height = 0;

        while (1 == 1){
            // nodeCount (queue size) indicates number of nodes
            // at current level.
            int nodeCount = q.size();
            if (nodeCount == 0)
                return height;
            height++;
  
            // Dequeue all nodes of current level and Enqueue all
            // nodes of next level
            while (nodeCount > 0)
            {
                Node newnode = q.peek();
                q.remove();
                if (newnode.left != null)
                    q.add(newnode.left);
                if (newnode.right != null)
                    q.add(newnode.right);
                nodeCount--;
            }
        }
        
    }
    public static void main(String args[]){
        HeightBT tree = new HeightBT();
         
        // Let us create a binary tree shown in above diagram
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("The recursive Height of tree is " + tree.treeHeightIterative(tree.root));
        System.out.println("The iterative Height of tree is " + tree.treeHeightRecursive(tree.root));
    }
}
