package BasicQ20;

import java.util.Arrays;

public class TransposeMatrix867 {
    public static void main(String[] args) {

        TransposeMatrix867 transposeMatrix867 = new TransposeMatrix867();

        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int[][] result = transposeMatrix867.transpose(matrix);

        System.out.println(Arrays.deepToString(result));
    }

    private int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }
}
