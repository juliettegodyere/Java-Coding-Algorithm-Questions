package Array.Problems;

public class ReverseArray {
    static char[] reverseArrayMethodMe(String a, int n){
        
        char[] temp = new char[n];
        int j = 0;
        for (int i = n-1; i >= 0; i--){
            temp[j++] = a.charAt(i);
        }
        return temp;
    }
    //Using built in reverse() method of the StringBuilder class:
    static char[] reverseArrayStringBuilder(String a, int n){
        StringBuilder sb = new StringBuilder(n);
        char[] result = sb.reverse().toString().toCharArray();
        
       return result;
    }

    static void reversearrayCharArray(String a, int n){ 
        char[] temp = a.toCharArray();
        int j = 0;
        for (int i = temp.length - 1; i >= 0; i--)
            System.out.print(temp[i]);
    }

    public static void main(String args[]) {
       String str = "geeksforgeeks";
    //    char[] arr = reverseArrayMethodMe(str, str.length());
       char[] arr = reverseArrayStringBuilder(str, str.length());
       for (int i = 0; i < arr.length; i++){
           System.out.print(arr[i]);
       }
 
    }
}
