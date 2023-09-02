package arrays.inplace;

import util.ArrayUtil;

/**
 * https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 * <p>
 * Replace Elements with Greatest Element on Right Side Given an array arr, replace every element in that array with the
 * greatest element among the elements to its right, and replace the last element with -1.
 * <p>
 * After doing so, return the array.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [17,18,5,4,6,1] Output: [18,6,6,6,1,-1] Explanation: - index 0 --> the greatest element to the right of
 * index 0 is index 1 (18). - index 1 --> the greatest element to the right of index 1 is index 4 (6). - index 2 --> the
 * greatest element to the right of index 2 is index 4 (6). - index 3 --> the greatest element to the right of index 3
 * is index 4 (6). - index 4 --> the greatest element to the right of index 4 is index 5 (1). - index 5 --> there are no
 * elements to the right of index 5, so we put -1. Example 2:
 * <p>
 * Input: arr = [400] Output: [-1] Explanation: There are no elements to the right of index 0.
 */
public class ReplaceWithRightMax {

  public static void main(String[] args) {
    ArrayUtil.printArray(new ReplaceWithRightMax().replaceElements(new int[]{56903, 18666, 60499, 57517, 26961}));
  }

  public int[] replaceElements(int[] arr) {
    int max = Integer.MIN_VALUE;
    int maxPos = -1;
    for (int i = 0; i < arr.length; i++) {
      if (maxPos > i) {
        arr[i] = max;
        continue;
      }
      max = Integer.MIN_VALUE;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] > max) {
          max = arr[j];
          maxPos = j;
        }
      }
      arr[i] = max;
    }
    arr[arr.length - 1] = -1;
    return arr;
  }
}
