package Trees;

import Trees.Node;
  
class TreeTransversal {
    // Root of Binary Tree
    Node root;
  
    TreeTransversal() {
        root = null;
    }
  
    void postorder(Node node) {
        if (node == null)
            return;
  
        // Traverse left
        postorder(node.left);
        // Traverse right
        postorder(node.right);
    // Traverse root
        System.out.print(node.data + "->");
    }
  
    void inorder(Node node) {
        if (node == null)
            return;
  
        // Traverse left
        inorder(node.left);
        // Traverse root
        System.out.print(node.data + "->");
        // Traverse right
        inorder(node.right);
    }
  
    void preorder(Node node) {
        if (node == null)
            return;
  
        // Traverse root
        System.out.print(node.data + "->");
        // Traverse left
        preorder(node.left);
        // Traverse right
        preorder(node.right);
    }
  
    public static void main(String[] args) {
        TreeTransversal tree = new TreeTransversal();
        tree.root = new Node(1);
        tree.root.left = new Node(12);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);
        tree.root.left.left.left = new Node(20);
        tree.root.left.right.right = new Node(40);
    
        System.out.println("Inorder traversal");
        tree.inorder(tree.root);
    
        System.out.println("\nPreorder traversal ");
        tree.preorder(tree.root);
    
        System.out.println("\nPostorder traversal");
        tree.postorder(tree.root);
    }
}
