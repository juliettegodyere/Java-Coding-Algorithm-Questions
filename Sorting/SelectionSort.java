package Sorting;

public class SelectionSort {
    static int[] sort(int arr[], int N){
        
        for (int i = 0; i < N-1; i++){
            int min_idx = i;
            for (int j = i+1; j < N; j++){
                if(arr[j] < arr[min_idx]){
                    // arr[i] = arr[j];
                    min_idx = j;
                }
            } 
            int temp = arr[min_idx];
            arr[min_idx] =  arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    static void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[] = {0, 2, 1, 2, 0};
        int N = arr.length;
        sort(arr, N);
        System.out.println("Sorted array");
        printArray(arr);
    }
    // Time Complexity: O(n2) as there are two nested loops.
    // Auxiliary Space: O(1) 
}

