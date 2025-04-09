package arrays.matrix;

import java.util.*;

public class PascalsTriangle {

  public static void main(String[] args) {
    System.out.println("Pascals Triangle : " + new PascalsTriangle().pascalTriangle(5));
  }

  public List<List<Integer>> pascalTriangle(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < numRows; i++) {
      List<Integer> row = new ArrayList<>();
      for (int j = 0; j < i + 1; j++) {
        if (j == 0 || j == i) {
          row.add(1);
        }
        if (j == i) {
          break;
        }
        List<Integer> prevRow = result.get(i - 1);
        System.out.println(prevRow + ", j=" + j + ", i= " + i);
        row.add(-1);
      }
      result.add(row);
    }
    return result;
  }
}
