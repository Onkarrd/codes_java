package java.arrays.misc;

import java.util.Arrays;

public class DiffBetTwoArray {

  public static void main(String[] args) {
    System.out.println(
        Arrays.toString(new DiffBetTwoArray().setDifference(new int[]{1, 5, 7, 9}, new int[]{1, 3, 4, 7})));
  }

  public int[] setDifference(int[] nums1, int[] nums2) {
    int p1 = 0, p2 = 0, m = nums1.length, n = nums2.length;
    int[] res = new int[m + n];
    int i = 0;
    while (p1 < m || p2 < n) {
      if (p1 < m && p2 < n && nums1[p1] == nums2[p2]) {
        p1++;
        p2++;
        continue;
      }
      if (p1 < m && p2 < n && nums1[p1] > nums2[p2]) {
        res[i++] = nums2[p2];
        p2++;
      } else {
        res[i++] = nums1[p1];
        p1++;
      }
      if (p1 == m - 1) {
        res[i++] = nums2[p2++];
      }
      if (p2 == n - 1) {
        res[i++] = nums1[p1++];
      }
    }
    int[] solution = new int[i];
    System.arraycopy(res, 0, solution, 0, i);
    return solution;
  }
}
