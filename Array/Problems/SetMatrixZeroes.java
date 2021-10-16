package Array.Problems;

public class SetMatrixZeroes {
    public static int[][] setZeroes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
                if (matrix[i][j] == 0) {
                    setAll(matrix, i, j);
                }
            }
        }
        return matrix;
    }

    static void setAll(int[][] matrix, int k, int m) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[k][i] = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[j][m] = 0;
            }
        }
    }

    public static void main(String args[]) { 
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] newx = setZeroes(matrix);
        for (int i = 0; i < newx.length; i++) {
            for (int j = 0; j < newx[i].length; j++) {
                System.out.println(newx[i][j]);
            }
        }
    } 
}
