package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequences {

  public static void main(String[] args) {
    int[] arr = {3, 1, 2};
    int n = arr.length;
    List<Integer> sequence = new ArrayList<>();
    subsequences(0, sequence, n, arr);
  }

  private static void subsequences(int i, List sequence, int n, int[] arr) {
    if (i >= n) {
      System.out.println(sequence.toString());
      return;
    }
    sequence.add(arr[i]);
    subsequences(i + 1, sequence, n, arr);
    sequence.remove(sequence.size() - 1);
    subsequences(i + 1, sequence, n, arr);
  }
}
