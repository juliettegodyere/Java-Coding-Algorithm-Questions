package Sorting;

public class CountingSort {
    static int countinSort(int[]arr, int N){
        int max = 0;
        for(int i = 0; i < N; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int[] count = new int[max+1];
        int[] output = new int[N];
        for(int i = 0; i < count.length; i++){
            count[i] = 0;
        }
        for(int i = 0; i < N; i++){
            ++count[arr[i]];
        }
        for(int i = 1; i < count.length; i++){
            count[i] = count[i] + count[i - 1];
        }
        // for (int i = 0; i < count.length; i++){
        //     System.out.print(count[i] + " ");
        // }
        for(int i = N - 1; i >= 0; i--){
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        for(int i = 0; i < N; i++){
            arr[i] = output[i];
        }
        for (int i = 0; i < N; i++){
            System.out.print(arr[i] + " ");
        }

       //System.out.print("The maximum element is : " + max);
       return 0;
    }
    //https://www.youtube.com/watch?v=pEJiGC-ObQE
    //https://www.programiz.com/dsa/counting-sort
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        int n = arr.length;
        countinSort(arr, n);
        
      }
    
}
