package arrays;

/**
 * LEETCODE Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * <p>
 * Return the running sum of nums.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4] Output: [1,3,6,10] Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 * Example 2:
 * <p>
 * Input: nums = [1,1,1,1,1] Output: [1,2,3,4,5] Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1,
 * 1+1+1+1, 1+1+1+1+1]. Example 3:
 * <p>
 * Input: nums = [3,1,2,10,1] Output: [3,4,6,16,17]
 */
public class RunningSum {

  public int[] runningSum(int[] nums) {
    int[] sum = new int[nums.length];
    int runningSum = 0;
    for (int i = 0; i < nums.length; i++) {
      runningSum += nums[i];
      sum[i] = runningSum;
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] solution = new RunningSum().runningSum(new int[]{1, 2, 3, 4});
    for (int i = 0; i < solution.length; i++) {
      System.out.println(solution[i]);
    }
  }
}
