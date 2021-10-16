package SlidingWindow;
//Solution:https://www.callicoder.com/count-occurrences-of-anagram/
//Questions: https://practice.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1
public class CountOccurencesOfAnagrams {
    static int search(String pat, String txt) {
	    // code here
        int count = 0;

        for (int i = 0; i < txt.length(); i++){
            String str = "";
            System.out.println("looping");
            for (int j = i; j < txt.length(); j++){
                str += txt.charAt(j);
                System.out.println("str " + str);
                System.out.println("Pat " + pat + " contains " + str);
                if(pat.contains(str)){
                    if(str.length() == pat.length()){
                        System.out.println("Yes");
                        count++;
                        break;
                    }
                  
                }
            }
            // System.out.println("str outside" + str);
            // if(pat.contains(str)){
            //     count++;
            // }
        }

        return count;
	}
    public static void main(String args[]){
        // Given string str
        String string2 = "forxxorfxdofr";
        String string1 = "for";
  
        // Function Call
        System.out.println(search(string1, string2));
    }
}
