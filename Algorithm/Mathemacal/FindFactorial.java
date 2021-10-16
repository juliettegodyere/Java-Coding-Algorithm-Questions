package Algorithm.Mathemacal;

import java.util.*;

public class FindFactorial {
    static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        int mul = N;
        int x = 0;
        for (int i = 0; i < N; i++){
            System.out.println(N - i);
            mul = mul * (N - 1);
            list.add(i + 1);
        }
        System.out.println("Multiply" + mul);
        return list;
    }
    public static void main (String[] args)
    {
        int N = 5;
        ArrayList<Integer> list = factorial(N);
        for(int i = 0; i < list.size(); i++){
            System.out.println("value: " + list.get(i));
        }
    
    }   
}
