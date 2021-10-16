package String.Problems;

//Solution: https://www.geeksforgeeks.org/minimum-number-of-times-a-has-to-be-repeated-such-that-b-is-a-substring-of-it/
//Qustion: https://practice.geeksforgeeks.org/problems/0cba668df04d657fde4d1bd28b626a01e61097f1/1
public class SubstringInsideAnotherSubstring {
    static int repeatedStringMatch(String A, String B) {
        int ans = 1;

        // To store repeated string
        String S = A;

        // Until size of S is less than B
        while (S.length() < B.length()) {
            S += A;
            ans++;
        }

        // ans times repetition makes required answer
        if (issubstring(B, S))
            return ans;

        // Add one more string of A
        if (issubstring(B, S + A))
            return ans + 1;

        return -1;
    }

    static boolean issubstring(String str2, String rep1) {
        int M = str2.length();
        int N = rep1.length();

        // Check for substring from starting
        // from i'th index of main string
        for (int i = 0; i <= N - M; i++) {
            int j;

            // For current index i,
            // check for pattern match
            for (j = 0; j < M; j++)
                if (rep1.charAt(i + j) != str2.charAt(j))
                    break;

            if (j == M) // pattern matched
                return true;
        }

        return false; // not a substring
    }

    public static void main(String[] args) {
        String A = "abcd", B = "cdabcdab";

        // Function call
        System.out.println(repeatedStringMatch(A, B));
    }
}
