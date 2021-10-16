package Sorting;
public class mergeSort {
    void mergeSort(int arr[], int l,  int r){
        if(r > l){
            int m = l+ (r-l)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }
    void merge(int[] arr, int l, int m, int r){

    }
    public static void main(String[] args) {
        
      }
    
}
