package String.Problems;

import java.util.*;
//How do you print the first non-repeated character from a string?
public class NonRereatedElements {
    static void characterOccrencesCount(String str){
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
        char[] charcters = str.toCharArray();
        for(Character c : charcters){
            if(mp.containsKey(c)){
                mp.put(c, mp.get(c) + 1);
            }else{
                mp.put(c, 1);
            }
        }
        for(Map.Entry<Character, Integer> entry: mp.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("The first occurence is :" + entry.getKey());
                //return entry.getKey();
            }
        }
        //return 0;
    }
    public static void main(String[] args)
    {
        String s = "geek";
 
        characterOccrencesCount(s);

    }
}
