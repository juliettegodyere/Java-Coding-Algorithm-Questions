package String.Problems;

public class LastIndex {
    static int lastIndex( String s) {
        int index = -1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                index = i;
            }
        }
        return index;
    }
    public int lastIndex2( String s) {
        int n = s.length();
        for(int i = n - 1; i >=0; i--){
            if(s.charAt(i) == '1'){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        String str = "00000111";

        System.out.print("The last index is: " + lastIndex(str));
    }
}
