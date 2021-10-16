package String.Problems;

import Trees.Node;

public class ConvertTernaryExpressionToBinaryTree {
    class Node {
        int key;
        Node left, right;
    
        public Node(int item) {
          key = item;
          left = right = null;
        }
      }    
   static Node root;
    public static Node convertExp(String str, int i){
        str = str.replaceAll("[^a-zA-Z]", "");
        return root;
    }
    Node insertKey(Node root, int key) {
        if (root == null) {
          root = new Node(key);
          return root;
        }
    
        if (key < root.key)
          root.left = insertKey(root.left, key);
        else if (key > root.key)
          root.right = insertKey(root.right, key);
    
        return root;
      }
    public static void main(String[] args) {
        String s = "a?b:c";
        convertExp(s, 0);
    }
}
