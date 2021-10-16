package Trees.Problems;
import java.util.*;
//https://practice.geeksforgeeks.org/problems/preorder-traversal-and-bst4006/1
//https://www.geeksforgeeks.org/check-if-a-given-array-can-represent-preorder-traversal-of-binary-search-tree/
public class PreorderTransversalBST {
    
    static int canRepresentBST(int pre[], int n) {
        // code here
        Stack<Integer> s = new Stack<Integer>();
        int root = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (pre[i] < root) {
                return 0;
            }
   
            while (!s.empty() && s.peek() < pre[i]) {
                root = s.peek();
                s.pop();
            }
   
            s.push(pre[i]);
        }

        return 1;

    }

    public static void main(String args[]) {
        int[] pre1 = new int[]{40, 30, 35, 20, 80, 100};
        int n = pre1.length;
        /*
         * creating a binary tree and entering the nodes
         */
        System.out.println(canRepresentBST(pre1, n));
    }
}

