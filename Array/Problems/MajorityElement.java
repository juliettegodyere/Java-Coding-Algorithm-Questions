package Array.Problems;

import java.io.*;
import java.util.HashMap;

//A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element). 

// Java program to demonstrate insert
// operation in binary search tree.

class Node {
    int key;
    int count = 0;
    Node left, right;

}

class MajorityElement {

    static int max = 0;

    // A utility function to create a
    // new BST node
    static Node newNode(int item) {
        Node temp = new Node();
        temp.key = item;
        temp.count = 1;
        temp.left = temp.right = null;
        return temp;
    }

    // A utility function to insert a new node
    // with given key in BST
    static Node insert(Node node, int key) {
        // If the tree is empty,
        // return a new node
        if (node == null) {
            if (max == 0)
                max = 1;
            return newNode(key);
        }
        // Otherwise, recur down the tree
        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else
            node.count++;
        // Find the max count
        max = Math.max(max, node.count);
        // Return the (unchanged) node pointer
        return node;
    }

    // A utility function to do inorder
    // traversal of BST
    static void inorder(Node root, int s) {
        if (root != null) {
            inorder(root.left, s);
            if (root.count > (s / 2))
                System.out.println(root.key + "\n");
            inorder(root.right, s);
        }
    }

    static int majorityElementLinear(int a[], int size) {
        // your code here
        int max_count = 0;
        int max_index = -1;
        int count;
        int mid = size / 2;
        for (int i = 0; i < size; i++) {
            count = 0;
            for (int j = 0; j < size; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > max_count) {
                max_count = count;
                max_index = i;
            }

        }
        if (max_count > mid)
            return a[max_index];
        else
            return 0;
    }

    static void majorityElementHashMap(int a[], int size) {
        // your code here
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < size; i++) {
            if (map.containsKey(a[i])) {
                count = map.get(a[i]) + 1;
                if (count > size / 2) {
                    System.out.println("Majority found :- " + a[i]);
                    return;
                } else {
                    map.put(a[i], count);
                }
            }else{
                map.put(a[i], 1);
            }
        }
        System.out.println(" No Majority element");

    }

    // Driver Code
    public static void main(String[] args) {
        int a[] = { 2,2,2,2,5,5,2,3,3 };
        int size = a.length;
        Node root = null;

        for (int i = 0; i < size; i++) {
            root = insert(root, a[i]);
        }

        System.out.println("BST time for majority element");
        if (max > (size / 2))
            inorder(root, size);
        else
            System.out.println("No majority element\n");

        System.out.println("Quadratic time for majority element");
        System.out.println(majorityElementLinear(a, size));
        System.out.println("Hash Map time for majority element");
        majorityElementHashMap(a, size);

    }
}

// This code is contributed by avanitrachhadiya2155
