package java.binary_search;

import java.util.Arrays;

public class FindSmallestDivisor {

  public int smallestDivisor(int[] nums, int limit) {
    int low = 1, high = Arrays.stream(nums).max().getAsInt(), min = Integer.MAX_VALUE;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (sumOfDivs(nums, mid) < limit) {
        min = Math.min(min, mid);
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return min;
  }

  int sumOfDivs(int[] nums, int divisor) {
    return Arrays.stream(nums).map(n -> (n + divisor - 1) / divisor).sum();
  }

  public static void main(String[] args) {
    System.out.println(new FindSmallestDivisor().smallestDivisor(new int[]{8, 4, 2, 3}, 8));
  }

}
