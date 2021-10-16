package Array.Problems;

public class RepeatingElements {

    public static int[] twoRepeatingElementLinear(int A[],int N){
        // code herefor
        int[] temp = new int[2];
        if(N == 0 || N == 1){
            return temp;
        }
        int k = 0;
        for(int i = 0; i < N; i++){
            for (int j = i+1; j < N; j++){
                if(A[i] == A[j]){
                    temp[k] = A[i];
                    k++;
                }
            }
        }
        
        return temp;
    }
    // public static int[] twoRepeatingElementCount(int A[],int N){
    //     // code herefor
    //     int count_len = N-2;
    //     int[] temp = new int[2];
    //     int[] count = new int[count_len];
       
    //     int k = 0;
    //     for(int i = 0; i < N; i++){
    //         if(A[i] == A[j]){
    //             temp[k] = A[i];
    //             k++;
    //         }
    //         count[i] = A[i];
    //     }
        
    //     return temp;
    // }
   
    public static void main (String[] args) {  
        int arr[] = {4,2,4,5,2,3,1};  
        int length = arr.length;  
        int[] result = twoRepeatingElementLinear(arr, length);  

        for (int i=0; i<result.length; i++)  
            System.out.print(result[i] + " ");  
    }  
    
}
