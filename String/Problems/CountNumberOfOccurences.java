package String.Problems;

public class CountNumberOfOccurences {
    static int NumberOfOcurrences(String str, char ch){
        int count = 0;
        for (int i = 0; i < str.length();i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]) { 
        String S = "abdefgabef";
        System.out.println(NumberOfOcurrences(S, 'g'));
     } 
}
