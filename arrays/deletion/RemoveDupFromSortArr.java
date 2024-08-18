package arrays.deletion;

import util.ArrayUtil;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/ Remove Duplicates from Sorted Array
 * <p>
 * Solution Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each
 * unique element appears only once. The relative order of the elements should be kept the same. Then return the number
 * of unique elements in nums.
 * <p>
 * Consider the number of unique elements of nums be k, to get accepted, you need to do the following things:
 * <p>
 * Change the array nums such that the first k elements of nums contain the unique elements in the order they were
 * present in nums initially. The remaining elements of nums are not important as well as the size of nums. Return k.
 * Custom Judge:
 * <p>
 * The judge will test your solution with the following code:
 * <p>
 * int[] nums = [...]; // Input array int[] expectedNums = [...]; // The expected answer with correct length
 * <p>
 * int k = removeDuplicates(nums); // Calls your implementation
 * <p>
 * assert k == expectedNums.length; for (int i = 0; i < k; i++) { assert nums[i] == expectedNums[i]; } If all assertions
 * pass, then your solution will be accepted.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,2] Output: 2, nums = [1,2,_] Explanation: Your function should return k = 2, with the first two
 * elements of nums being 1 and 2 respectively. It does not matter what you leave beyond the returned k (hence they are
 * underscores). Example 2:
 * <p>
 * Input: nums = [0,0,1,1,1,2,2,3,3,4] Output: 5, nums = [0,1,2,3,4,_,_,_,_,_] Explanation: Your function should return
 * k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively. It does not matter what you leave
 * beyond the returned k (hence they are underscores).
 */
public class RemoveDupFromSortArr {

  public static void main(String[] args) {
    System.out.println(new RemoveDupFromSortArr().removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
  }

  public int removeDuplicates(int[] nums) {
    int unique = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
        nums[unique++] = nums[i];
      }
    }
    ArrayUtil.printArray(nums);
    return unique;
  }
}
