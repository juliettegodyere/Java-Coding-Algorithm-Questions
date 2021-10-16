
package Trees.Problems;
import java.util.*;
import Trees.Node;

//https://practice.geeksforgeeks.org/problems/inorder-traversal-iterative/1
public class iterativeInoderTransversal {
    
    Node root;

    iterativeInoderTransversal() {
        root = null;
    }

    ArrayList<Integer> inorderIterative() {
        ArrayList<Integer> result = new ArrayList<Integer>();

        if (root == null) {
            return null;
        }
        Stack<Node> stack = new Stack<Node>();
        Node newNode = root;

        while (newNode != null || stack.size() > 0) {
            while (newNode != null) {
                stack.push(newNode);
                newNode = newNode.left;
            }
            newNode = stack.pop();
            result.add(newNode.data);
            //System.out.print(newNode.data + "->");
            newNode = newNode.right;

        }
        return result;
    }
    public static List < Integer > inorderRecursive(Node root) {
        List < Integer > res = new ArrayList < > ();
        helper(root, res);
        return res;
    }

    public static void helper(Node root, List < Integer > res) {
        if (root != null) {
            if (root.left != null) {
                helper(root.left, res);
            }
            res.add(root.data);
            if (root.right != null) {
                helper(root.right, res);
            }
        }
    }

    public static void main(String args[]) {

        /*
         * creating a binary tree and entering the Nodes
         */
        iterativeInoderTransversal tree = new iterativeInoderTransversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        ArrayList<Integer> res = tree.inorderIterative();
        for(int i: res){
             System.out.print(i + "->");
        }
        // ArrayList<Integer> res2 = tree.inorderRecursive();
        // for(int i: res2){
        //      System.out.print(i + "->");
        // }
    }
}
