package binary_search;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RoseGarden {

  public int roseGarden(int n, int[] nums, int k, int m) {
    if (n < m * k) {
      return -1;
    }
    int low = Arrays.stream(nums).min().getAsInt(), high = Arrays.stream(nums).max().getAsInt(), ans = -1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (possibleWith(nums, mid, m, k)) {
        ans = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return ans;
  }

  private boolean possibleWith(int[] nums, int days, int m, int k) {
    int count = 0, b = 0;
    for (int num : nums) {
      if (num <= days) {
        count++;
      } else {
        b += count / k;
        count = 0;
      }
    }
    b += count / k;
    return b >= m;
  }

  public static void main(String[] args) {
    System.out.println(new RoseGarden().roseGarden(8, new int[]{7, 7, 7, 7, 13, 11, 12, 7}, 2, 3));
  }
}
