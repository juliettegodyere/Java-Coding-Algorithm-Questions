package String.Problems;

//Question https://practice.geeksforgeeks.org/problems/print-first-letter-of-every-word-in-the-string3632/1/?category[]=Strings&category[]=Strings&page=1&query=category[]Stringspage1category[]Strings
public class PrintFirstLetterOfEveryWordInTheString {

    // My method. Passed all test cases
    static String firstAlphabet(String S) {
        // Your code goes here
        if (S.length() == 0) {
            return null;
        }

        String str = "" + S.charAt(0);
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == ' ') {
                str = str + S.charAt(i + 1);
            }
        }
        return str;
    }
    //Another solutuion
    static String firstLetterWord(String str) {
        String result = "";

        // Traverse the string.
        boolean v = true;
        for (int i = 0; i < str.length(); i++) {
            // If it is space, set v as true.
            if (str.charAt(i) == ' ') {
                v = true;
            }

            // Else check if v is true or not.
            // If true, copy character in output
            // string and set v as false.
            else if (str.charAt(i) != ' ' && v == true) {
                result += (str.charAt(i));
                v = false;
            }
        }

        return result;
    }

    public static void main(String args[]) {
        String S = "bad is good";
        System.out.println(firstAlphabet(S));
    }
}

// Geek for geeks
