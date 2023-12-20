package arrays.misc;

/**
 * https://leetcode.com/problems/find-pivot-index/
 * <p>
 * LEETCODE 724. Find Pivot Index Easy 5.7K 603 Companies Given an array of integers nums, calculate the pivot index of
 * this array.
 * <p>
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum
 * of all the numbers strictly to the index's right.
 * <p>
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This
 * also applies to the right edge of the array.
 * <p>
 * Return the leftmost pivot index. If no such index exists, return -1.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,7,3,6,5,6] Output: 3 Explanation: The pivot index is 3. Left sum = nums[0] + nums[1] + nums[2] = 1 +
 * 7 + 3 = 11 Right sum = nums[4] + nums[5] = 5 + 6 = 11 Example 2:
 * <p>
 * Input: nums = [1,2,3] Output: -1 Explanation: There is no index that satisfies the conditions in the problem
 * statement. Example 3:
 * <p>
 * Input: nums = [2,1,-1] Output: 0 Explanation: The pivot index is 0. Left sum = 0 (no elements to the left of index 0)
 * Right sum = nums[1] + nums[2] = 1 + -1 = 0
 */
public class PivotIndex {

  public int pivotIndex(int[] nums) {

    for (int i = 0; i < nums.length; i++) {
      int leftSum = 0;
      int rightSum = 0;
      if (i != 0) {
        leftSum = calculateSum(0, i - 1, nums);
      }
      if (i != nums.length - 1) {
        rightSum = calculateSum(i + 1, nums.length - 1, nums);
      }
      if (leftSum == rightSum) {
        return i;
      }
    }
    return -1;
  }

  private int calculateSum(int start, int end, int[] nums) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      sum += nums[i];
    }
    return sum;
  }

  public int pivotIndex2(int[] nums) {
    // Initialize total sum of the given array...
    int totalSum = 0;
    // Initialize 'leftsum' as sum of first i numbers, not including nums[i]...
    int leftsum = 0;
    // Traverse the elements and add them to store the totalSum...
    for (int ele : nums) {
      totalSum += ele;
    }
    // Again traverse all the elements through the for loop and store the sum of i numbers from left to right...
    for (int i = 0; i < nums.length; leftsum += nums[i++])
    // sum to the left == leftsum.
    // sum to the right === totalSum - leftsum - nums[i]..
    // check if leftsum == totalSum - leftsum - nums[i]...
    {
      if (leftsum * 2 == totalSum - nums[i]) {
        return i;       // Return the pivot index...
      }
    }
    return -1;      // If there is no index that satisfies the conditions in the problem statement...
  }


  public static void main(String[] args) {
    int[] input = {1, 2, 3};

    System.out.println(new PivotIndex().pivotIndex(input));
  }

}
