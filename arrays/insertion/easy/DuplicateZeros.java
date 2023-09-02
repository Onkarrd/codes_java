package arrays.insertion.easy;

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

  public void duplicateZeros(int[] arr) {
    int n = arr.length, count = 0;

    for (int num : arr) {
      if (num == 0) {
        count++;
      }
    }
    int i = n - 1;
    int j = n + count - 1;

    while (i >= 0 && j >= 0) {

      if (arr[i] != 0) {
        if (j < n) {
          arr[j] = arr[i];
        }

      } else {
        if (j < n) {
          arr[j] = arr[i];
        }
        j--;
        if (j < n) {
          arr[j] = arr[i];
        }
      }

      i--;
      j--;
    }
  }

  public static void main(String[] args) {
    int arr[] = {1, 0, 2, 3, 0, 4, 5, 0};
    new DuplicateZeros().duplicateZeros(arr);
    ArrayUtil.printArray(arr);
  }
}
