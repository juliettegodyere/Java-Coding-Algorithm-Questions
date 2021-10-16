package String.Problems;

public class RotateString {
    static String reverseArray(String str, int start, int end)
    {
        char temp;
        char[] characters = str.toCharArray();
        while (start < end) {
            temp = characters[start];
            characters[start] = characters[end];
            characters[end] = temp;
            start++;
            end--;
        }
        return new String(characters);
    }
    static String rightRotateLinearMethod(String str, int k){
        char[] characters = str.toCharArray();
        int n = characters.length;
        char temp = characters[n-1];
       
        for(int i = n - 1; i > 0; i--){
            characters[i] = characters[i - 1];
        }
        characters[0] = temp; 
       return new String(characters);
    }
    static String leftRotateLinearMethod(String str, int d){
        char[] characters = str.toCharArray();
        for (int i = 0; i < d; i++){
            char j, first;
            first = characters[0];
            for(j = 0; j < characters.length - 1; j++){
                characters[j] = characters[j+1];
            }
            characters[j] = first;

        }
        return new String(characters);
    }
    //Cyclically rotate an array by one
    static String rightRotateQuadraticMethod(String str, int d){
        char[] characters = str.toCharArray();
        int n = str.length();
        for (int i = 0; i < d; i++){
            char last;
            int j;
            last = characters[n-1];
            for(j = n-1; j > 0; j--){
                characters[j] = characters[j-1];
            }
            characters[0] = last;

        }
        return new String(characters);
    }

    public static void main(String[] args)
    {
        String str = "qwertyu";
        int n = str.length();
 
    //    System.out.println(reverseArray(str, 0, n-1));
    //    System.out.println(rightRotateLinearMethod(str, 2));
       //System.out.println(leftRotateLinearMethod(str, 2));
       System.out.println(leftRotateLinearMethod(str, 2));
       //System.out.println(rightRotateQuadraticMethod(str, 2));
    }
}
