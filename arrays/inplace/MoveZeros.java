package arrays.inplace;

import util.ArrayUtil;

/**
 * Move Zeroes
 * <p>
 * Solution Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the
 * non-zero elements.
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0] Example 2:
 * <p>
 * Input: nums = [0] Output: [0]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 104 -231 <= nums[i] <= 231 - 1
 * <p>
 * <p>
 * Follow up: Could you minimize the total number of operations done?
 */
public class MoveZeros {

  public static void main(String[] args) {
    int[] nums = new int[]{0, 0, 1};
    new MoveZeros().moveZeroes(nums);
    ArrayUtil.printArray(nums);
  }

  public void moveZeroes(int[] nums) {
    int length = nums.length;
    int nonZeroPtr = 0;
    for (int i = 0; i < length; i++) {
      if (nums[i] != 0) {
        nums[nonZeroPtr++] = nums[i];
      }
    }
    for (int i = nonZeroPtr; i < nums.length; i++) {
      nums[i] = 0;
    }
  }
}
