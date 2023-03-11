package arrays.insertion;

import util.ArrayUtil;

/**
 * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the
 * right.
 * <p>
 * Note that elements beyond the length of the original array are not written. Do the above modifications to the input
 * array in place and do not return anything.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [1,0,2,3,0,4,5,0] Output: [1,0,0,2,3,0,0,4] Explanation: After calling your function, the input array is
 * modified to: [1,0,0,2,3,0,0,4] Example 2:
 * <p>
 * Input: arr = [1,2,3] Output: [1,2,3] Explanation: After calling your function, the input array is modified to:
 * [1,2,3]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr.length <= 104 0 <= arr[i] <= 9
 */
public class DuplicateZeros {

  public static void main(String[] args) {
    int[] arr = new int[]{0, 0, 0, 0, 0, 0, 0};
    duplicateZeros(arr);

  }

  private static void duplicateZeros(int[] arr) {
    int i = 0, j = 0;
    while (i < arr.length - 1) {
      if (arr[i] == 0) {
        int c = arr.length - 1;
        int temp;
        while (c > i + 1) {
          arr[c] = arr[c - 1];
          c--;
        }
        arr[++i] = 0;
      }
      i++;
    }
    ArrayUtil.printArray(arr);
  }
}
