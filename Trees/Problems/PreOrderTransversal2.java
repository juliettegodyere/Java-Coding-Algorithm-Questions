package Trees.Problems;
//https://www.geeksforgeeks.org/iterative-preorder-traversal/
public class PreOrderTransversal2 {
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> preOrder(Node root)
    {
        // Code
        ArrayList<Integer> result = new ArrayList<Integer>();

        if (root == null) {
            return null;
        }
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        // Node newNode = root;

        while (stack.empty() == false) {
            Node mynode = stack.peek();
            result.add(mynode.data);
            //System.out.print(mynode.data + " ");
            stack.pop();

            if (mynode.right != null) {
                stack.push(mynode.right);
            }
            if(mynode.left != null){
                stack.push(mynode.left);
            }

        }
        return result;
    }
    
}
