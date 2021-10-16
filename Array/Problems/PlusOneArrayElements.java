package Array.Problems;

import java.util.ArrayList;

//https://practice.geeksforgeeks.org/problems/plus-one/1
//https://www.youtube.com/watch?v=_sls9AdBymI
//My personal solving
public class PlusOneArrayElements {
    static ArrayList<Integer> increment(ArrayList<Integer> arr, int N) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = N - 1; i >= 0; i--) {
            int check = arr.get(i) + 1;
            if (check > 9) {
                arr.set(i, 0);
            } else {
                arr.set(i, check);
                return arr;
            }

        }
        result.add(0, 1);
        for (int i = 0; i < N; i++) {
            result.add(0);
        }

        return result;
    }
    //Efficient solution
    public int[] plusOne(int[] digits) {
        int N = digits.length;
        for (int i = N - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } 
            digits[i] = 0;;
        }
        int[] incident = new int[N+1];
        incident[0] = 1;
        return incident;
    }

    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(9);
        result.add(9);
        result.add(9);
        result.add(9);
        int size = result.size();

        ArrayList<Integer> te = increment(result, size);
        for (int i : te) {
            System.out.print(i + " ");
        }

    }
}
