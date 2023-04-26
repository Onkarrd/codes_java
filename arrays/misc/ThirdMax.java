package arrays.misc;

import java.util.Arrays;
import util.ArrayUtil;

/**
 *
 */
class ThirdMax {

  public int thirdMax(int[] nums) {
    Arrays.sort(nums);
    reverse(nums);
    ArrayUtil.printArray(nums);
    int prev = nums[0];
    int counter = 1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != prev) {
        counter++;
        prev = nums[i];
      }
      if (counter == 3) {
        return prev;
      }
    }
    return nums[0];
  }

  private void reverse(int[] nums) {
    for (int i = 0; i < nums.length / 2; i++) {
      int temp = nums[i];
      nums[i] = nums[nums.length - i - 1];
      nums[nums.length - i - 1] = temp;
    }
  }

  public static void main(String[] args) {
    System.out.println(new ThirdMax().thirdMax(new int[]{1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}));
  }
}
