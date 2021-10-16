package String.Problems;

public class FindSubstring {
    static int isSubstring(String s1, String s2) {
        int M = s1.length();
        int N = s2.length();

        for (int i = 0; i <= N - M; i++) {
            int j;

            for (j = 0; j < M; j++)
                if (s2.charAt(i + j) != s1.charAt(j))
                    break;
            
            if (j == M)
                return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        String s1 = "for";
        String s2 = "geeksforgeeks";

        int res = isSubstring(s1, s2);

        if (res == -1)
            System.out.println("Not present");
        else
            System.out.println("Present at index " + res);
    }
}

// I   J   s2.charAt(i+j)   s1.charAt(j)   M
// 0   0       g               f           3
// 1   0       e               f         
// 2   0       e               f         
// 3   0       k               f         
// 4   0       s               f         
// 5   0       f               f         
// 5   1       o               o
// 5   2       r               r
// 5   3       