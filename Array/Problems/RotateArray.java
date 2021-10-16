package Array.Problems;

public class RotateArray {
    
    static int [] leftRotateLinearMethod(int[] arr, int d){
        for (int i = 0; i < d; i++){
            int j, first;
            first = arr[0];
            for(j = 0; j < arr.length - 1; j++){
                arr[j] = arr[j+1];
            }
            arr[j] = first;

        }
        return arr;
    }
    //Cyclically rotate an array by one
    static int[] rightRotateQuadraticMethod(int[] arr, int d){
        int n = arr.length;
        for (int i = 0; i < d; i++){
            int j, last;
            last = arr[n-1];
            for(j = n-1; j > 0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;

        }
        return arr;
    }
    static int[] rightRotateLinearMethod(int arr[], int n)
    {
        int temp = arr[n-1];
       
        for(int i = n - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = temp; 
       return arr;
    }

    static void leftRotateTempAarry(int arr[], int d, int n){
        int temp[] = new int[d];
 
        for (int i = 0; i < d; i++)
            temp[i] = arr[i];
 
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
 
        for (int i = 0; i < d; i++) {
            arr[i + n - d] = temp[i];
        }
    }
    static void leftRotateReversalMethod(int arr[], int d)
    {
  
        if (d == 0)
            return;
  
        int n = arr.length;
        // in case the rotating factor is
        // greater than array length
        d = d % n;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }
  
    /*Function to reverse arr[] from index start to end*/
    static void reverseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) 
    { 
        int arr[] = {1, 2, 3, 4, 5}; 
        int arr2[] = {1, 2, 3, 4, 5}; 
        int arr3[] = {9, 8, 7, 6, 4, 2, 1, 3};
        int n = arr.length;
        int d = 1; 
        int[] result = rightRotateQuadraticMethod(arr, d);
        System.out.println("Quadratic Array after left rotation: ");  
        for(int i = 0; i< result.length; i++){  
            System.out.print(result[i] + " ");  
        } 
        int[] result4 = rightRotateLinearMethod(arr, d);
        System.out.println("Linear Array after left rotation: ");  
        for(int i = 0; i< result4.length; i++){  
            System.out.print(result4[i] + " ");  
        } 
        System.out.println("Temp Array after left rotation: ");  
        leftRotateTempAarry(arr2, 3, n) ;
        for (int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i] + " ");

        // System.out.println("Cyclically rotate an array by one: "); 
        // int[] result2 = rightRotateLinearMethod(arr3, 1) ; 
        // for(int i = 0; i< result2.length; i++){  
        //     System.out.print(result2[i] + " ");  
        // } 
        System.out.println("Left Reversal rotate an array by one: "); 
        leftRotateReversalMethod(arr3, 1) ; 
        for(int i = 0; i< arr3.length; i++){  
            System.out.print(arr3[i] + " ");  
        } 
    } 
}
