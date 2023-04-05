package arrays.searching;

/**
 * Valid Mountain Array
 * <p>
 * Solution Given an array of integers arr, return true if and only if it is a valid mountain array.
 * <p>
 * Recall that arr is a mountain array if and only if:
 * <p>
 * arr.length >= 3 There exists some i with 0 < i < arr.length - 1 such that: arr[0] < arr[1] < ... < arr[i - 1] <
 * arr[i] arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [2,1] Output: false Example 2:
 * <p>
 * Input: arr = [3,5,5] Output: false Example 3:
 * <p>
 * Input: arr = [0,3,2,1] Output: true
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr.length <= 104 0 <= arr[i] <= 104
 */
public class ValidMountainArray {

  public static void main(String[] args) {
    System.out.println(new ValidMountainArray().validMountainArray(new int[]{0, 1, 2, 1, 2}));
  }

  public boolean validMountainArray(int[] arr) {
    boolean NoOtherCondition = true;
    boolean decrease = false;
    boolean increase = false;
    if (arr.length == 1) {
      return false;
    }
    for (int i = 1; i < arr.length; i++) {
      if (!decrease && arr[i] > arr[i - 1]) {
        increase = true;
        continue;
      } else if (increase && arr[i] < arr[i - 1]) {
        decrease = true;
      } else {
        NoOtherCondition = false;
      }
    }
    return increase && decrease && NoOtherCondition;
  }
}
//BETTER
