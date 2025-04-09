package arrays.arithmatics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import util.ArrayUtil;

public class UnionOfTwoSortedArrays {

  public static void main(String[] args) {
    int[] nums1 = {3, 4, 6, 7, 9, 9};
    int[] nums2 = {1, 5, 7, 8, 8};
    ArrayUtil.printArray(new UnionOfTwoSortedArrays().unionArray(nums1, nums2));
  }

  public int[] unionArray(int[] nums1, int[] nums2) {
    Set<Integer> set = new HashSet<>();
    int p1 = 0, p2 = 0;
    while (p1 < nums1.length && p2 < nums2.length) {
      if (nums1[p1] < nums2[p2]) {
        set.add(nums1[p1]);
        p1++;
      } else if (nums1[p1] == nums2[p2]) {
        set.add(nums1[p1]);
        p1++;
        p2++;
      } else {
        set.add(nums2[p2]);
        p2++;
      }
    }
    while (p1 < nums1.length) {
      set.add(nums1[p1]);
      p1++;
    }
    while (p2 < nums2.length) {
      set.add(nums2[p2]);
      p2++;
    }
    return set.stream().mapToInt(i -> i).toArray();
  }
}
