package UnvisitedIndicesInfiniteArray;

import java.util.*;

//Questions: https://practice.geeksforgeeks.org/problems/2caf0501a39567d653197364a2b5c8a9f5943b7e/1#
public class RestrictedPacman {
    // Correct but was rejected because it took longer than expected
    static int candies(int m, int n) {

        int X = (m * n) - m - n;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(X);

        int count = 0;
        while (!queue.isEmpty()) {

            int curr = queue.poll();

            count++;

            if (curr - m > 0)
                queue.add(curr - m);
            if (curr - n > 0)
                queue.add(curr - n);
        }

        return count;
    }

    // Passed all test cases
    static int candies2(int m, int n) {
        if (m > n) {
            if (m % 2 == 0)
                return (m / 2) * (n - 1) - (n / 2);
            else
                return (m / 2) * (n - 1);
        } else {
            if (n % 2 == 0)
                return (n / 2) * (m - 1) - (m / 2);
            else
                return (n / 2) * (m - 1);
        }
    }

    static int candies3(int m, int n) { 
    	// Your code goes here
     
       int max = (m*n)-m-n; //forbenius method
       int  count = max/2 +1; 
       return count;
   }

    public static void main(String args[]) {
        int n = 2, m = 5;
        System.out.print(candies(m, n));
        System.out.print(candies2(m, n));
        System.out.print(candies3(m, n));
    }
}
