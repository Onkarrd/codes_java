package arrays.misc;

import java.util.ArrayList;
import java.util.List;

public class LandAndRiverCount {

  public static int riverSizes(int[][] matrix) {
    int noOfIslands = 0;
    List<Integer> marked = new ArrayList<Integer>();
    int row = matrix.length;
    int col = matrix[0].length;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (matrix[i][j] == 1) {
          matrix[i][j] = 0;
          calculateSize(1, matrix, i, j, row, col);
          noOfIslands++;
        }
      }
    }
    return noOfIslands;
  }

  private static int calculateSize(int size, int[][] matrix, int i, int j, int row, int col) {
    if (i + 1 != row && matrix[i + 1][j] == 1) {
      matrix[i + 1][j] = 0;
      size = calculateSize(++size, matrix, i + 1, j, row, col);
    }
    if (j + 1 != col && matrix[i][j + 1] == 1) {
      matrix[i][j + 1] = 0;
      size = calculateSize(++size, matrix, i, j + 1, row, col);
    }
    if (j != 0 && matrix[i][j - 1] == 1) {
      matrix[i][j - 1] = 0;
      size = calculateSize(++size, matrix, i, j - 1, row, col);
    }
    if (i != 0 && matrix[i - 1][j] == 1) {
      matrix[i - 1][j] = 0;
      size = calculateSize(++size, matrix, i - 1, j, row, col);
    }
    return size;
  }

  public static void main(String[] args) {
    int[][] matrix = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
    System.out.println(riverSizes(matrix));
  }
}