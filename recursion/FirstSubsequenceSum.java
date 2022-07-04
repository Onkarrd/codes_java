package recursion;

import java.util.ArrayList;
import java.util.List;

public class FirstSubsequenceSum {

  public static void main(String[] args) {
    int[] arr = {3, 1, 2, 1};
    int n = arr.length;
    int s = 2;
    int sum = 0;
    List<Integer> sequence = new ArrayList<>();
    subsequences(0, sequence, n, arr, sum, s);
  }

  private static boolean subsequences(int i, List sequence, int n, int[] arr, int sum, int s) {
    if (i >= n) {
      if (sum == s) {
        System.out.println(sequence.toString());
        return true;
      }
      sum = 0;
      return false;
    }
    sequence.add(arr[i]);
    sum += arr[i];
    if (subsequences(i + 1, sequence, n, arr, sum, s)) {
      return true;
    }
    sum = sum - (int) sequence.get(sequence.size() - 1);
    sequence.remove(sequence.size() - 1);
    if (subsequences(i + 1, sequence, n, arr, sum, s)) {
      return true;
    }
    return false;
  }
}
