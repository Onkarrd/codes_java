package arrays.searching;

import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * https://leetcode.com/problems/check-if-n-and-its-double-exist/
 * <p>
 * <p>
 * Check If N and Its Double Exist Given an array arr of integers, check if there exist two indices i and j such that :
 * <p>
 * i != j 0 <= i, j < arr.length arr[i] == 2 * arr[j]
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [10,2,5,3] Output: true Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j] Example
 * 2:
 * <p>
 * Input: arr = [3,1,7,11] Output: false Explanation: There is no i and j that satisfy the conditions.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 2 <= arr.length <= 500 -103 <= arr[i] <= 103
 */
public class CheckIfNAndItsDoubleExist {

  public static void main(String[] args) {
    System.out.println(new CheckIfNAndItsDoubleExist().checkIfExist(new int[]{4, 1, 8, 11}));
  }

  public boolean checkIfExist(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      set.add(arr[i]);
    }
    for (int i = 0; i < arr.length; i++) {
      if (set.contains(arr[i] * 2) && arr[i] * 2 != arr[i]) {
        return true;
      }
      set.add(arr[i]);
    }
    return false;
  }
}
//BETTER