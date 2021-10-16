package Trees.Problems;

import java.util.ArrayList;
import Trees.Node;

//https://www.geeksforgeeks.org/boundary-traversal-of-binary-tree/

// Java program to print boundary traversal of binary tree

/* A binary tree node has data, pointer to left child
and a pointer to right child */

class BoundaryTraversal {
	Node root;

	// A simple function to print leaf nodes of a binary tree
	ArrayList<Integer>  printLeaves(Node node){
        ArrayList <Integer> result = new ArrayList<>();

        if (node == null)
			return null;

		printLeaves(node.left);
		// Print it if it is a leaf node
		if (node.left == null && node.right == null)
			System.out.println(node.data + "from the print leave function ");
            
			result.add(node.data);
		printLeaves(node.right);

		// for (int i: result){
		// 	System.out.print(i + " Print the");
		// }
		System.out.println(result.size() + "The length ");
        return result;
	}

	// A function to print all left boundary nodes, except a leaf node.
	// Print the nodes in TOP DOWN manner
	ArrayList<Integer> printBoundaryLeft(Node node){
        ArrayList <Integer> result = new ArrayList<>();
        if (node == null)
			return null;

		if (node.left != null) {
			// to ensure top down order, print the node
			// before calling itself for left subtree
			//System.out.print(node.data + " ");
            result.add(node.data);
			printBoundaryLeft(node.left);
		}
		else if (node.right != null) {
			//System.out.print(node.data + " ");
            result.add(node.data);
			printBoundaryLeft(node.right);
		}

		// do nothing if it is a leaf node, this way we avoid
		// duplicates in output
        return result;
	}

	// A function to print all right boundary nodes, except a leaf node
	// Print the nodes in BOTTOM UP manner
	ArrayList<Integer> printBoundaryRight(Node node){
        ArrayList <Integer> result = new ArrayList<>();

		if (node == null)
			return null;

		if (node.right != null) {
			// to ensure bottom up order, first call for right
			// subtree, then print this node
			printBoundaryRight(node.right);
			//System.out.print(node.data + " ");
            result.add(node.data);
		}
		else if (node.left != null) {
			printBoundaryRight(node.left);
			//System.out.print(node.data + " ");
            result.add(node.data);
		}
		// do nothing if it is a leaf node, this way we avoid
		// duplicates in output
		
        return result;
	}

	// A function to do boundary traversal of a given binary tree
	ArrayList <Integer> printBoundary(Node node){
        ArrayList <Integer> result = new ArrayList<>();

        if (node == null)
			return result;

		System.out.println(node.data + "Printing the root data");
        result.add(node.data);

		// Print the left boundary in top-down manner.
		//printBoundaryLeft(node.left);
        ArrayList<Integer> boundaryLeftValue = printBoundaryLeft(node.left);
		for(int i: boundaryLeftValue){
            result.add(i);
			System.out.println(i + "Printing the boundary left data");
        }

		// Print all leaf nodes
		// printLeaves(node.left);
		// printLeaves(node.right);
        ArrayList<Integer> printLeavesValue = printLeaves(node.left);
        //printLeavesValue = printLeaves(node.right);
		for(int i: printLeavesValue){
            result.add(i);
			System.out.println(i + "Printing the leave data");
        }

		// Print the right boundary in bottom-up manner
		//printBoundaryRight(node.right);
        ArrayList<Integer> BoundaryRightValue = printBoundaryRight(node.right);
		for(int i: BoundaryRightValue){
            result.add(i);
			System.out.println(i + "Printing the boundary right data");
        }
        return result;
	}

	// Driver program to test above functions
	public static void main(String args[]){
		BoundaryTraversal tree = new BoundaryTraversal();
		tree.root = new Node(20);
		tree.root.left = new Node(8);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(12);
		tree.root.left.right.left = new Node(10);
		tree.root.left.right.right = new Node(14);
		tree.root.right = new Node(22);
		tree.root.right.right = new Node(25);
		ArrayList <Integer> result = tree.printBoundary(tree.root);
        for(int i: result){
            System.out.print(i + " ");
        }
        System.out.println();
	}
}

