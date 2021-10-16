package Sorting;
public class insertionSort {
    //https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
    //Did'nt pass the time limit here
    public static int [] insertion_linear(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && key < arr[j]){
                    arr[j+1] = arr[j];
                    j = j-1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};
        int[] result = insertion_linear(arr);
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
      }
    // Time Complexity: O(n^2) loss case best time is O(n)
    // Auxiliary Space: O(1)
}

// loop 1
// [8, 2, 4, 9, 3, 6]
// key = 1 - 2, prev = i-1 - 8
// [2, 8, 4, 9, 3, 6]
// key = 2 - 4, prev = i-1 - 8
// [2, 4, 8, 9, 3, 6]
// key = 3 - 5, prev = i-1 - 7
// [2, 5, 5, 7, 9.6]

