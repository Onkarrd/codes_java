package arrays.matrix;

import java.util.ArrayList;
import java.util.List;

public class LandAndRiver {

  public static List<Integer> riverSizes(int[][] matrix) {
    List<Integer> sizes = new ArrayList<>();
    List<Integer> marked = new ArrayList<>();
    int row = matrix.length;
    int col = matrix[0].length;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (matrix[i][j] == 1 && !marked.contains(i * 10 + j)) {
          marked.add(i * 10 + j);
          int size = calculateSize(1, matrix, i, j, row, col, marked);
          sizes.add(size);
        }
      }
    }
    return sizes;
  }

  private static int calculateSize(int size, int[][] matrix, int i, int j, int row, int col, List<Integer> marked) {
    if (i + 1 != row && matrix[i + 1][j] == 1 && !marked.contains((i + 1) * 10 + j)) {
      marked.add((i + 1) * 10 + j);
      size = calculateSize(++size, matrix, i + 1, j, row, col, marked);
    }
    if (j + 1 != col && matrix[i][j + 1] == 1 && !marked.contains(i * 10 + (j + 1))) {
      marked.add(i * 10 + j + 1);
      size = calculateSize(++size, matrix, i, j + 1, row, col, marked);
    }
    if (j != 0 && matrix[i][j - 1] == 1 && !marked.contains(i * 10 + (j - 1))) {
      marked.add(i * 10 + (j - 1));
      size = calculateSize(++size, matrix, i, j - 1, row, col, marked);
    }
    if (i != 0 && matrix[i - 1][j] == 1 && !marked.contains((i - 1) * 10 + j)) {
      marked.add((i - 1) * 10 + j);
      size = calculateSize(++size, matrix, i - 1, j, row, col, marked);
    }
    return size;
  }

  public static void main(String[] args) {
    int[][] matrix = {{1, 0}, {0, 1}};
    List<Integer> sizes = riverSizes(matrix);
    System.out.println(sizes);
  }
}