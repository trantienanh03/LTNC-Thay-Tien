package buoi2;

public class Bai6 {
    //    a
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // b
    public static int[][] createPascalTriangle(int size) {
        int[][] triangle = new int[size][];
        for (int row = 0; row < size; row++) {
            triangle[row] = new int[row + 1];
            for (int col = 0; col <= row; col++) {
                if (col == 0) {
                    triangle[row][col] = 1;
                } else {
                    triangle[row][col] = triangle[row][col - 1] + 1;
                }
            }
        }
        return triangle;
    }

//    option: lam thanh tam giac can

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8},};
        printMatrix(matrix);

        int[][] res = createPascalTriangle(5);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
