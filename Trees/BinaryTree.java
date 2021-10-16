package Trees;

public class BinaryTree {
  Node root;

  BinaryTree(int key) {
    root = new Node(key);
  }

  BinaryTree() {
    root = null;
  }

  // Traverse Inorder
  public void traverseInOrder(Node node) {
    if (node != null) {
      traverseInOrder(node.left);
      System.out.print(" " + node.data);
      traverseInOrder(node.right);
    }
  }

  // Traverse Postorder
  public void traversePostOrder(Node node) {
    if (node != null) {
      traversePostOrder(node.left);
      traversePostOrder(node.right);
      System.out.print(" " + node.data);
    }
  }

  // Traverse Preorder
  public void traversePreOrder(Node node) {
    if (node != null) {
      System.out.print(" " + node.data);
      traversePreOrder(node.left);
      traversePreOrder(node.right);
    }
  }

    /* Print nodes at the current level */
    void printCurrentLevel (Node root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printCurrentLevel(root.left, level-1);
            printCurrentLevel(root.right, level-1);
        }
    }

  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();

    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);

    System.out.print("Pre order Traversal: ");
    tree.traversePreOrder(tree.root);
    System.out.print("\nIn order Traversal: ");
    tree.traverseInOrder(tree.root);
    System.out.print("\nPost order Traversal: ");
    tree.traversePostOrder(tree.root);
  }
}
