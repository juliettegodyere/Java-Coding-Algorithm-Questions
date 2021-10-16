package String.Problems;

//How do you count a number of vowels and consonants in a given string?
public class CountVowels {
    static int vowels(String str){
        char[] letter = str.toCharArray();
        int count = 0; 
        for (char c : letter) { 
            switch (c) { 
                case 'a': 
                case 'e': 
                case 'i': 
                case 'o': 
                case 'u': 
                    count++; 
                break; 
                default: 
                // no count increment 
            } 
        } 
        System.out.println("Number of vowels in String [" + str + "] is : " + count); 
        return count;
    }
    public static void main(String[] args)
    {
        String s = "geek";
 
        System.out.println(vowels(s) + " ");

    }
}
