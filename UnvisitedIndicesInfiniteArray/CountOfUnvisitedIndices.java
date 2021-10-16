package UnvisitedIndicesInfiniteArray;

import java.util.*;
//Questions and solution: https://www.geeksforgeeks.org/find-the-count-of-unvisited-indices-in-an-infinite-array/
public class CountOfUnvisitedIndices {
   //Function to return the count
    // of unvisited indices starting
    // from the index 0
    public static int countUnvisited(int n, int m)
    {
  
        // Largest index that
        // cannot be visited
        int X = (m * n) - m - n;
  
        // Push the index to the queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(X);
  
        // To store the required count
        int count = 0;
        while (!queue.isEmpty()) {
  
            // Current index that cannot be visited
            int curr = queue.poll();
  
            // Increment the count for
            // the current index
            count++;
  
            // (curr - m) and (curr - n) are also
            // unreachable if they are valid indices
            if (curr - m > 0)
                queue.add(curr - m);
            if (curr - n > 0)
                queue.add(curr - n);
        }
  
        // Return the required count
        return count;
    }
  
    // Driver code
    public static void main(String args[])
    {
        int n = 2, m = 5;
        System.out.print(countUnvisited(n, m));
    }
}
