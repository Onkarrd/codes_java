package arrays.matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import util.ArrayUtil;

/**
 * Print in spiral way
 * <pre>
 * input
 * <p>
 * 1   2   3   4
 * 5   6   7   8
 * 9   10  11  12
 * 13  14  15  16
 * <p>
 * output
 * 1    2   3   4
 * 12   13  14  5
 * 11   16  15  6
 * 10   9   8   7
 * </pre>
 */
public class SpiralPrint {


  public static void main(String[] args) {
    int[][] input = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
    ArrayUtil.printMatrix(input, 4, 4);
    printSpiral(input, 4, 4);
  }

  private static void printSpiral(int[][] input, int row, int col) {
    List<Integer> res = new ArrayList<>();
    int left = 0, top = 0, right = row - 1, bottom = col - 1;
    while (top <= bottom && left <= right) {
      for (int i = left; i <= right; i++) {
        res.add(input[top][i]);
      }
      top++;
      for (int i = top; i <= bottom; i++) {
        res.add(input[i][right]);
      }
      right--;
      if (top <= bottom) {
        for (int i = right; i >= left; i--) {
          res.add(input[bottom][i]);
        }
        bottom--;
      }
      if (left <= right) {
        for (int i = bottom; i >= top; i--) {
          res.add(input[i][left]);
        }
        left++;
      }

    }
    System.out.println(res);
  }
}
