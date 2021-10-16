package Array.Problems;
import java.util.*;

//https://practice.geeksforgeeks.org/problems/merge-k-sorted-arrays/1
public class MergeKSortedArray {
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                list.add(arr[i][j]);
            }
        }
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{2,2,3,4},{5,5,6,6},{7,8,9,9}};
        int size = arr.length;
        System.out.println(size);
        
        System.out.println("Quadratic time for Frequencies of array elements");
        for (int i : mergeKArrays(arr, size)) {
            System.out.print(i);
        }
       

    }
}
