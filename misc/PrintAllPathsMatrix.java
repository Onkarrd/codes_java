package misc;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPathsMatrix {

  public static void main(String[] args) {
    int[][] input = {{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};

    int m = input.length;
    int n = input[0].length;
    int start = input[0][0];
    int end = input[m - 1][n - 1];

    List<Integer> list = new ArrayList<>();
    printPath(input, m - 1, n - 1, 0, 0, list);

  }

  private static void printPath(int[][] input, int m, int n, int i, int j, List<Integer> list) {
      if (i > m || j > n) {
          return;
      }
    list.add(input[i][j]);
    if (i == m && j == n) {
      System.out.println(list);
    }
    printPath(input, m, n, i + 1, j, list);
    printPath(input, m, n, i, j + 1, list);

    list.remove(list.size() - 1);
  }
}
