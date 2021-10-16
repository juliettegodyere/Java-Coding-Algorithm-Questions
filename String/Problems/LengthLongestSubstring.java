package String.Problems;

import java.util.HashMap;

//https://practice.geeksforgeeks.org/problems/length-of-the-longest-substring3036/1
//https://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters/
public class LengthLongestSubstring {

    static int longestUniqueSubsttr(String S) {
        int maxsub = 0;
        int n = S.length();
        boolean istrue = false;
        for (int i = 0; i < n; i++) {
            String sub = "" + S.charAt(i);
            for (int j = i + 1; j < n; j++) {
                istrue = false;
                for (int k = 0; k < sub.length(); k++) {
                    if (sub.charAt(k) == S.charAt(j)) {
                        istrue = true;
                        break;
                    }
                }
                if (istrue) {
                    break;
                }
                sub = sub + S.charAt(j);
            }
            // System.out.println("Sub strings : " + sub);
            maxsub = Math.max(maxsub, sub.length());
        }
        return maxsub;
    }

    static int longestUniqueSubsttrHashMap(String s) {

        HashMap<Character, Integer> seen = new HashMap<>();
        int maximum_length = 0;

        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            if (seen.containsKey(s.charAt(end))) {
                start = Math.max(start, seen.get(s.charAt(end)) + 1);
                // System.out.println(s.charAt(end) + " The value already inserted");
                // System.out.println(start + " Start @ ");
            }

            // Updating the last seen value of the character
            seen.put(s.charAt(end), end);
            // System.out.println("I have not been inserted " + s.charAt(end) + " " + end + " ");
            // System.out.println("I am comparing " + maximum_length + " " + (end - start + 1) + " ");
            maximum_length = Math.max(maximum_length, end - start + 1);
        }
        return maximum_length;
    }

    // Driver code

    public static void main(String args[]) {
        String S = "abdefgabef";
        System.out.println(longestUniqueSubsttr(S));
        System.out.println(longestUniqueSubsttrHashMap(S));
    }

}
