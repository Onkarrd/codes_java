package arrays.arithmatics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import util.ArrayUtil;

public class IntersectionOfTwoSortedArrays {

  public static void main(String[] args) {
    int[] nums1 = {3, 4, 6, 7, 9, 9};
    int[] nums2 = {1, 5, 7, 8, 8};
    ArrayUtil.printArray(new IntersectionOfTwoSortedArrays().intersectArray(nums1, nums2));
  }

  public int[] intersectArray(int[] nums1, int[] nums2) {
    List<Integer> list = new ArrayList<>();
    int i = 0, j = 0;
    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] == nums2[j]) {
        list.add(nums1[i]);
        i++;
        j++;
      } else if (nums1[i] < nums2[j]) {
        i++;
      } else {
        j++;
      }
    }
    return list.stream().mapToInt(ii -> ii).toArray();
  }
}
