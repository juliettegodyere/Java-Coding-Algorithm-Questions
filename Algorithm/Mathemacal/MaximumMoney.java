package Algorithm.Mathemacal;

public class MaximumMoney {
    //0(n^2)
    static int maximizeMoney(int N , int K) {
        // code here
        int X = 0;
        for (int i = 0; i < N; i+=2){
            X = X + K;
        }
        return X;
    }

    static int maximizeMoney2(int N , int K) {
        // code here
        int X = 0;
        
        return X;
    }
    public static void main(String args[]) {
        System.out.println(maximizeMoney(5, 10));
    }
}
