package CodingText;
//https://www.tutorialspoint.com/java-program-to-find-the-length-of-the-longest-consecutive-1-s-in-binary-representation-of-a-given-integer
//https://practice.geeksforgeeks.org/problems/longest-consecutive-1s-1587115620/1/?company[]=Microsoft&company[]=Microsoft&page=1&query=company[]Microsoftpage1company[]Microsoft
public class MaxConsecutiveOnes {
    public static int maxConsecutiveOnes(int N) {
        
        // Your code here
            int count = 0;
            while (N!=0) {
                N = (N & (N << 1));
                count++;
            }
        return count;
        
    }
}
