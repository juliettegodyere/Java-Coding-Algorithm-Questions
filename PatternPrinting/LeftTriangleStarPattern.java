package PatternPrinting;

public class LeftTriangleStarPattern {
    static void printPattern() {
        // for(int i = 0; i < n; i++){
        // for(int j = 2*(n-1); j >=0; i--){
        // System.out.print(" ");
        // }

        // }

        int i, j, row = 6;
        // Outer loop work for rows
        for (i = 0; i < row; i++) {
            // inner loop work for space
            for (j = 2 * (row - i); j >= 0; j--) {
                // prints space between two stars
                System.out.print(" ");
            }
            // inner loop for columns
            for (j = 0; j <= i; j++) {
                // prints star
                System.out.print("* ");
            }
            // throws the cursor in a new line after printing each line
            System.out.println();
        }

    }
    public static void main(String[] args)
    {
        printPattern();
    }
}

//              * 
//            * * 
//          * * * 
//        * * * * 
//      * * * * * 
//    * * * * * * 