package recursion;

import java.util.ArrayList;
import java.util.List;

public class NoOfSubsequenceSum {

  public static void main(String[] args) {
    int[] arr = {3, 1, 2, 2, 4};
    int n = arr.length;
    int s = 4;
    int sum = 0;
    List<Integer> sequence = new ArrayList<>();
    System.out.println("No. of subsequences : " + subsequences(0, sequence, n, arr, sum, s));
  }

  private static int subsequences(int i, List sequence, int n, int[] arr, int sum, int s) {
    if (i >= n) {
      if (sum == s) {
        System.out.println(sequence.toString());
        return 1;
      }
      return 0;
    }
    sequence.add(arr[i]);
    sum += arr[i];
    int l = subsequences(i + 1, sequence, n, arr, sum, s);
    sum = sum - (int) sequence.get(sequence.size() - 1);
    sequence.remove(sequence.size() - 1);
    int r = subsequences(i + 1, sequence, n, arr, sum, s);
    return l + r;
  }
}
