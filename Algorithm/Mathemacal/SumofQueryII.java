package Algorithm.Mathemacal;

import java.util.*;

//Question: https://practice.geeksforgeeks.org/problems/sum-of-query-ii5310/1
//Solution: https://www.youtube.com/watch?v=XAk_Jr3EyJ8
public class SumofQueryII {
    //Passed all test cases
    static List<Integer> querySum(int n, int arr[], int q, int queries[]) {

        List<Integer> result = new ArrayList<>();
        int startIndex = 0;
        int endIndex = 1;
        int length = queries.length;

        while (endIndex < length) {

            int sum = 0;

            for (int i = queries[startIndex] - 1; i <= queries[endIndex] - 1; i++) {
                sum = sum + arr[i];
            }

            result.add(sum);
            startIndex = startIndex + 2;
            endIndex = endIndex + 2;
        }
        return result;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4 };
        int n = arr.length;
        int q = 2;
        int[] queries = { 1, 4, 2, 3 };
        List<Integer> list = querySum(n, arr, q, queries);
        System.out.println("I am playing volluas");
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));

        }
    }
}
