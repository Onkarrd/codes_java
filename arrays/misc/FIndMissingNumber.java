package arrays.misc;

import arrays.sortings.QuickSort;
import java.util.Arrays;
import java.util.stream.IntStream;
import util.ArrayUtil;

//https://takeuforward.org/plus/dsa/arrays/logic-building/find-missing-number
public class FIndMissingNumber {

  public static void main(String[] args) {
    System.out.println(new FIndMissingNumber().missingNumber(new int[]{0, 1, 2, 3}));
  }

  public int missingNumber(int[] nums) {
    int expectedSum = IntStream.range(1, nums.length).sum();
    int sum = Arrays.stream(nums).sum();
    System.out.println(expectedSum + " " + sum);
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != i) {
        return i;
      }
    }
    return nums.length;
  }
}
