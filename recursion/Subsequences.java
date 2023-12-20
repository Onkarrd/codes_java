package recursion;

import java.util.ArrayList;
import java.util.List;
import util.ArrayUtil;

public class Subsequences {

  public static void main(String[] args) {
    int[] arr = {1, 2, 1, 1};
    int n = arr.length;
    List<Integer> sequence = new ArrayList<>();
    int s = 3;
    int sum = 0;
    System.out.println(subsequences(0, sequence, n, arr, s, sum));
  }

  private static int subsequences(int i, List sequence, int n, int[] arr, int s, int sum) {
    if (i >= n) {
      if (sum == s) {
        System.out.println(sequence);
        return 1;
      }
      return 0;
    }
    sequence.add(arr[i]);
    sum += arr[i];
    int l = (subsequences(i + 1, sequence, n, arr, s, sum));
    sum -= arr[i];
    sequence.remove(sequence.size() - 1);
    int r = (subsequences(i + 1, sequence, n, arr, s, sum));
    return l + r;
  }
}
