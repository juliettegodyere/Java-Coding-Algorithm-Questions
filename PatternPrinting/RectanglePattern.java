package PatternPrinting;

public class RectanglePattern {
    static void rectangle() {

        int i, j, row = 6;
        // Outer loop work for rows
        for (i = 0; i < row; i++) {
            for (j = row; j >= 0; j--) {
                System.out.print("* ");
            }
            for (j = row-i; j > 1; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        rectangle();
    }
}
