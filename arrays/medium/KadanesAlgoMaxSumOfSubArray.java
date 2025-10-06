package arrays.medium;

public class KadanesAlgoMaxSumOfSubArray {

  public static void main(String[] args) {
    System.out.println(new KadanesAlgoMaxSumOfSubArray().maxSubArray(new int[]{-6, -5, 10, -3, -3, 7, -8, -11}));
  }

  public int maxSubArray(int[] nums) {
    // maximum sum
    long maxi = Long.MIN_VALUE;

    //current sum of subarray
    long sum = 0;
    int startInx = -1, endInx = -1, start = -1;
    // Iterate through the array
    for (int i = 0; i < nums.length; i++) {
      if (sum == 0) {
        start = i;
      }
      // Add current element to the sum
      sum += nums[i];

      // Update maxi if current sum is greater
      if (sum > maxi) {
        maxi = sum;
        startInx = start;
        endInx = i;
      }

      // Reset sum to 0 if it becomes negative
      if (sum < 0) {
        sum = 0;
      }
    }

    // Return the maximum subarray sum found
    System.out.println(startInx + ":" + endInx);
    return (int) maxi;
  }
}
