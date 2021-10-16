package String.Problems;

import java.util.regex.*;

public class CheckDigit {
    public static boolean
    onlyDigits(String str, int n){
        // Traverse the string from
        // start to end
        for (int i = 0; i < n; i++) {
  
            // Check if character is
            // digit from 0-9
            // then return true
            // else false
            if (str.charAt(i) >= '0'
                && str.charAt(i) <= '9') {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
    public static boolean onlyDigits(String str){
        // Regex to check string
        // contains only digits
        String regex = "[0-9]+";
  
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
  
        // If the string is empty
        // return false
        if (str == null) {
            return false;
        }
  
        // Find match between given string
        // and regular expression
        // using Pattern.matcher()
        Matcher m = p.matcher(str);
  
        // Return if the string
        // matched the ReGex
        return m.matches();
    }
    public static void main(String args[])
    {
        // Given string str
        String str = "1234";
        int len = str.length();
  
        // Function Call
        System.out.println(onlyDigits(str, len));
    }
    
}
