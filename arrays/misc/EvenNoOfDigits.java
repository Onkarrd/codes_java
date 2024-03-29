package arrays.misc;

/**
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * <p>
 * Given an array nums of integers, return how many of them contain an even number of digits.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [12,345,2,6,7896] Output: 2 Explanation: 12 contains 2 digits (even number of digits). 345 contains 3
 * digits (odd number of digits). 2 contains 1 digit (odd number of digits). 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits). Therefore only 12 and 7896 contain an even number of digits. Example
 * 2:
 * <p>
 * Input: nums = [555,901,482,1771] Output: 1 Explanation: Only 1771 contains an even number of digits.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 500 1 <= nums[i] <= 105
 */
public class EvenNoOfDigits {


  public static void main(String[] args) {
    System.out.println(evenNoOfDigits(new int[]{12, 345, 2, 6, 7896}));
  }

  private static int evenNoOfDigits(int[] nums) {
    int evnN = 0;
    for (int num : nums) {
      int count = 0;
      while (num > 0) {
        int rem = num % 10;
        num /= 10;
        count++;
      }
      if (count % 2 == 0) {
        evnN++;
      }
    }
    return evnN;
  }
}
