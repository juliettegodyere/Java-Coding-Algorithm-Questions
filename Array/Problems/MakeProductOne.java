package Array.Problems;

import java.util.ArrayList;

public class MakeProductOne {
    static int makeProductOne(int[] arr, int N) {
        // code here
        ArrayList<Integer> positive = new ArrayList<Integer>();
        ArrayList<Integer> negative = new ArrayList<Integer>();
        ArrayList<Integer> zero = new ArrayList<Integer>();
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] > 0) {
                positive.add(arr[i]);
            } else if (arr[i] == 0) {
                zero.add(arr[i]);
            } else {
                negative.add(arr[i]);
            }
        }
        if(positive.size() > 0){
            
        }
        for (int i = 0; i < positive.size(); i++) {
            count = count + (positive.get(i) + 1);
        }
        for (int i = 0; i < negative.size(); i++) {
            count = count + (negative.get(i) - 1);
        }
        if (zero.size() > 0) {
            count = count + zero.size();
        }else if(negative.size() % 2 == 0){
            count = count + 2;
        }
        
        return count;
    }

    public static void main(String args[]) {
        int[] arr = { -2, 4, 0 };
        int N = arr.length;
        System.out.println(makeProductOne(arr, N));
    }
}
