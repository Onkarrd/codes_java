package arrays.arithmatics;

import java.util.Arrays;
import util.ArrayUtil;

/**
 * Squares of a Sorted Array
 * <p>
 * Solution Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number
 * sorted in non-decreasing order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-4,-1,0,3,10] Output: [0,1,9,16,100] Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100]. Example 2:
 * <p>
 * Input: nums = [\] Output: [4,9,9,49,121]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 104 -104 <= nums[i] <= 104 nums is sorted in non-decreasing order.
 */
public class SquareOfSortedArray {

  public static void main(String[] args) {
    Integer i = null;
    int[] input = {-4, -1, 0, 3, 10};
    int[] res = squareOfSortedArray(input);
    ArrayUtil.printArray(res);
  }

  private static int[] squareOfSortedArray(int[] nums) {
    int n = nums.length;
    int[] res = new int[n];
    int left = 0, right = n - 1, i = n - 1;
    for (; left <= right; i--) {
      int leftSquare = nums[left] * nums[left];
      int rightSquare = nums[right] * nums[right];
      if (leftSquare > rightSquare) {
        res[i] = leftSquare;
        left++;
      } else {
        res[i] = rightSquare;
        right--;
      }
    }
    return res;
  }
}
