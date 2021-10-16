package String.Problems;

public class ReverseString {
    static String reverseTwoPointer(String str){
        char[] character = str.toCharArray();

        int i = 0;
        int j = character.length-1;

        while(i < j){
            swap(character, i, j);
            i++;
            j--;
        }
        return new String(character);
    }
    static void swap(char[] character, int i, int j){
        char temp = character[i];
        character[i] = character[j];
        character[j] = temp;
    }

    static void reverseRecursive(String str){
        int n = str.length();
        if(str == null || n <= 1){
            System.out.println(str);
        }else{
            System.out.print(str.charAt(n-1));
            reverseRecursive(str.substring(0, n-1));
        }
    }

    static String reverseLoop(String S) {
        // code here
        int N = S.length();
        String str = "";
        for (int i = N-1; i >= 0; i--){
            str = str + S.charAt(i);
        }
        return str;
    }

    public static void main(String[] args)
    {
        String str = "Great is Java";
 
       System.out.println(reverseTwoPointer(str));
       System.out.println(reverseLoop(str));
       reverseRecursive(str);
    }
}
