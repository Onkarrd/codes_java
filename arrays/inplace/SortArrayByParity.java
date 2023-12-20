package arrays.inplace;

import util.ArrayUtil;

/**
 * https://leetcode.com/problems/sort-array-by-parity/
 * <p> //TODO
 * Sort Array By Parity
 * <p>
 * Solution Given an integer array nums, move all the even integers at the beginning of the array followed by all the
 * odd integers.
 * <p>
 * Return any array that satisfies this condition.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,1,2,4] Output: [2,4,3,1] Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be
 * accepted. Example 2:
 * <p>
 * Input: nums = [0] Output: [0]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 5000 0 <= nums[i] <= 5000
 */
public class SortArrayByParity {

  public static void main(String[] args) {
    ArrayUtil.printArray(new SortArrayByParity().sortArrayByParity(new int[]{3, 1, 2, 4}));
  }

  public int[] sortArrayByParity(int[] nums) {
    int lastEvenIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 0) {
        int temp = nums[lastEvenIndex];
        nums[lastEvenIndex++] = nums[i];
        nums[i] = temp;
      }
    }
    return nums;
  }
}
