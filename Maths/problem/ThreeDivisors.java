package Maths.problem;

public class ThreeDivisors {
    //Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.
    //https://leetcode.com/contest/weekly-contest-252/problems/three-divisors/
    public static boolean isThree(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println("The value of i is : " + i);
                count++;
            }
        }
        System.out.println(count);
        if(count == 3){
            return true;
        }
        return false;
    }

  
    public static void main(String args[])
    {
        int n = 100;
        System.out.println("The divisors of : " + n + " is");
        System.out.println(isThree(n));
    }
}
