package arrays;

/**
 * Max Consecutive Ones
 * <p>
 * Solution Given a binary array nums, return the maximum number of consecutive 1's in the array.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,0,1,1,1] Output: 3 Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3. Example 2:
 * <p>
 * Input: nums = [1,0,1,1,0,1] Output: 2
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105 nums[i] is either 0 or 1.
 */
public class MaxConsecutiveOnes {

  public static void main(String[] args) {
    System.out.println(consecutiveOnes(new int[]{1, 1, 1, 0, 1, 1, 0, 1, 1}));
  }

  private static int consecutiveOnes(int[] nums) {
    int maxConOnes = 0, ones = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        ones = 0;
      } else {
        ones++;
        if (ones > maxConOnes) {
          maxConOnes = ones;
        }
      }
    }
    return maxConOnes;
  }
}
