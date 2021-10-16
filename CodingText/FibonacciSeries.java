package CodingText;
public class FibonacciSeries {
    //Time Complexity: T(n) = T(n-1) + T(n-2) which is exponential. 
    public static int fibonacci_recur(int n){
        if(n < 0 || n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return fibonacci_recur(n-1) + fibonacci_recur(n-2);
        }
    }
    public static int [] fibonacci_dynamic(int n){
        int f[] = new int[n+2];
        int i;
        f[0] = 0;
        f[1] = 1;
        
        for (i = 2; i <= n; i++){
            f[i] = f[i-1] + f[i-2];
        }
        
        return f;
    }
    public static void main(String[] args) {
        int n = 9;
        System.out.println(fibonacci_recur(n));
        //System.out.println(fibonacci_dynamic(n).toString());
        int arr [] = fibonacci_dynamic(n);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
      }
}
