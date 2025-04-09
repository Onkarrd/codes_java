package arrays.matrix;

import arrays.arithmatics.ReverseOfArray;
import util.ArrayUtil;

public class RotateBy90Degree {

  public static void main(String[] args) {
    int[][] matrix = ArrayUtil.formMatrix(3, 3);
    ArrayUtil.printMatrix(matrix);
    new RotateBy90Degree().rotateMatrix(matrix);
  }

  public void rotateMatrix(int[][] matrix) {

    for (int i = 0; i < matrix.length - 1; i++) {
      for (int j = i + 1; j < matrix[i].length; j++) {
        ArrayUtil.swap(matrix, i, j, j, i);
      }
    }
    System.out.println("Matrix after rotate");
    ArrayUtil.printMatrix(matrix);

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length / 2; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][matrix.length - 1 - j];
        matrix[i][matrix.length - 1 - j] = temp;
      }
    }
    System.out.println("Matrix after reverse");
    ArrayUtil.printMatrix(matrix);
  }
}
