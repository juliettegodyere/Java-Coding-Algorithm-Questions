package Array.Problems;
//Code accepted by letcode
public class SlowestKey {
    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        int largest = 0, index = 0;
        for (int i = 0; i <= releaseTimes.length-1; i++){
            int prev = i == 0 ? 0 : releaseTimes[i-1];
            System.out.println("Prev: " + prev);
            int check = releaseTimes[i] - prev;
            System.out.println("releaseTimes[i]: " + releaseTimes[i]);
            System.out.println("Check: " + check);
            System.out.println("Largest: " + largest);
            System.out.println("Index: "+ index);
            if(check > largest){
                    largest = check;
                    index = i;
                    System.out.println("check is larger");
            }
            if(check == largest){
                if(keysPressed.charAt(i) > keysPressed.charAt(index)){
                    index = i;
                    System.out.println("check is equal to larger");
                }
            }
            System.out.println("One loop done");
        }
        System.out.println("The largest index is: " + largest);
        return keysPressed.charAt(index);
    }

    public static void main(String args[]) { 
        int[] releaseTimes = {9,29,49,50};
        String keysPressed = "cbcd";
        System.out.println("Mine solution Max subarray is " );
        System.out.println(slowestKey(releaseTimes, keysPressed)); 
    } 
}
