package Array.Problems;

public class duplicateValues {

    public static int removeDuplicateConstantSpace(int A[],int N){
        // code herefor
        if(N == 0 || N == 1){
            return N;
        }
        
        int j = 0;
        //https://www.youtube.com/watch?v=gf7vdIin0dk
        for(int i = 0; i < N-1; i++){
            if(A[i] != A[i + 1]){
                A[j++] = A[i];
            }
        }
        A[j++] = A[N-1];
        
        return j;
    }
    public static int removeDuplicateXtraSpace(int A[],int N){
        // code herefor
        if(N == 0 || N == 1){
            return N;
        }
        int []temp = new int[N];
        int j = 0;
        //https://www.youtube.com/watch?v=gf7vdIin0dk
        for(int i = 0; i < N-1; i++){
            if(A[i] != A[i + 1]){
                temp[j++] = A[i];
            }
        }
        temp[j++] = A[N-1];

        for (int i=0; i<j; i++)
            A[i] = temp[i];
        
        return j;
    }
    public static void main (String[] args) {  
        int arr[] = {10,20,20,30,30,40,50,50};  
        int length = arr.length;  
        length = removeDuplicateXtraSpace(arr, length);  
        //length = removeDuplicateConstantSpace(arr, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    }  
    
}
