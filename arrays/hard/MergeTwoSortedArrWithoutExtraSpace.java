package arrays.hard;

import java.util.Arrays;
import util.ArrayUtil;
import util.Demo;

public class MergeTwoSortedArrWithoutExtraSpace {

  public static void main(String[] args) {
    new MergeTwoSortedArrWithoutExtraSpace().merge(new int[]{0, 2, 7, 8, 0, 0, 0}, 4, new int[]{-7, -3, -1}, 3);
  }

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int left = m - 1, right = 0;
    while (left >= 0 && right < n) {
      if (nums1[left] > nums2[right]) {
        int temp = nums1[left];
        nums1[left] = nums2[right];
        nums2[right] = temp;
        left--;
        right++;
      } else {
        break;
      }
    }
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    for (int i = m; i < m + n; i++) {
      nums1[i] = nums2[i - m];
    }
    System.out.println(Arrays.toString(nums1));
  }
}
