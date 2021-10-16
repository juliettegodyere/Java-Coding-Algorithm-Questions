package PatternPrinting;

public class RightPascalTriangle {
    static void RightTriangle() {

        int i, j, row = 6;
        // Outer loop work for rows
        for (i = 0; i < row; i++) {
           
            for (j = row-1; j >= i; j--) {
                System.out.print("* ");
            }
            for (j = row-i; j > 1; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args)
    {
        RightTriangle();
    }
}
