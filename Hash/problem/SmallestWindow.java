package Hash.problem;

//Smallest window in a string containing all the characters of another string 
//https://practice.geeksforgeeks.org/problems/smallest-window-in-a-string-containing-all-the-characters-of-another-string-1587115621/1
public class SmallestWindow {
    public static String smallestWindow(String s, String p) {
        int n = s.length();
        // Your code here
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)

                System.out.println(s.substring(i, j));

        return "";
    }

    public static void main(String[] args) {
        String S = "timetopractice";
        String P = "toc";
        smallestWindow(S, P);
    }
}
