package Trees;

public class BST {
    
    Node root;

    BST() {
        root = null;
    }

    Node search(Node root, int number){
        if(root == null){
            return null;
        }
        if(number == root.data){
            return root;
        }
        if(number < root.data){
            return search(root.left, number);
        }
        return search(root.right, number);
        
    }

    void insert(int key){
        root = insertKey(root, key);
    }

    Node insertKey(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key < root.data){
            root.left = insertKey(root.left, key);
        }
        if(key > root.data){
            root.right = insertKey(root.right, key);
        }
        return root;
    }
    void inorder(){
        inOrderRec(root); 
    }
    void inOrderRec(Node root){
        if(root != null){
            inOrderRec(root.left);
            System.out.print(root.data + " -> ");
            inOrderRec(root.right);
        }
    }
    void preorder(){
        inOrderRec(root); 
    }
    void preOrderRec(Node root){
        if(root != null){
            System.out.print(root.data + " -> ");
            inOrderRec(root.left);
            inOrderRec(root.right);
        }
    }
    void minVal(){
        System.out.println("The minimum value of BST " + minValue(root));
    }
    int minValue(Node root){
        Node current = root;

        while(current.left != null){
            current = current.left;
        }
        return current.data;
    }

    void maxVal(){
        System.out.println("The maximum value of BST " + maxValue(root));
    }
    int maxValue(Node root){
        Node current = root;

        while(current.right != null){
            current = current.right;
        }
        return current.data;
    }

    void deleteKey(int key) {
        root = deleteRec(root, key);
    }
    
    Node deleteRec(Node root, int key) {
        if (root == null)
          return root;
    
        if(key < root.data)
            root.left = deleteRec(root.left, key);
        else if (key > root.data)
            root.right = deleteRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
    

        root.data = minValue(root.right);
        root.right = deleteRec(root.right, root.data);
        }
    
        return root;
      }
    public static void main(String[] args){
        BST tree = new BST();

        tree.insert(8);
        tree.insert(3);
        tree.insert(1);
        tree.insert(6);
        tree.insert(7);
        tree.insert(10);
        tree.insert(14);
        tree.insert(4);

        System.out.print("Inorder traversal: ");
        tree.inorder();
        tree.minVal();
        tree.maxVal();
        System.out.print("Preorder traversal: ");
        tree.preorder();


        // System.out.println("\n\nAfter deleting 10");
        // tree.deleteKey(10);
        // System.out.print("Inorder traversal: ");
        // tree.inorder();
    }
}
