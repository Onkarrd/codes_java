package recursion;

import java.util.ArrayList;
import java.util.List;

public class AllSubsequencesSum {

  public static void main(String[] args) {
    int[] arr = {3, 1, 2, 1};
    int n = arr.length;
    int s = 2;
    int sum = 0;
    List<Integer> sequence = new ArrayList<>();
    subsequences(0, sequence, n, arr, sum, s);
  }

  private static void subsequences(int i, List sequence, int n, int[] arr, int sum, int s) {
    if (i >= n) {
      if (sum == s) {
        System.out.println(sequence.toString());
      }
      return;
    }
    sequence.add(arr[i]);
    sum += arr[i];
    subsequences(i + 1, sequence, n, arr, sum, s);
    sum = sum - (int) sequence.get(sequence.size() - 1);
    sequence.remove(sequence.size() - 1);
    subsequences(i + 1, sequence, n, arr, sum, s);
  }
}
