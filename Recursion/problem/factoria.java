package Recursion.problem;

public class factoria {
    static int factoriarecursive(int n){
        if(n == 0){
            return 1;
        }

        return n* factoriarecursive(n-1);
    }

    static int factoriaIterative(int n){
        int res = 1, i;

        for (i = 2; i <= n; i++){
            res *=i;
        }
        return res;
    }

    public static void main(String[] args)
    {
        int val = 5;
 
       System.out.println(factoriarecursive(val));
       System.out.println(factoriaIterative(val));

    }
}
