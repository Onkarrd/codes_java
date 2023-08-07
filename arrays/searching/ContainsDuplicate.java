package arrays.searching;

import java.util.HashSet;
import java.util.Set;
import util.ArrayUtil;

class ContainsDuplicate {

  public static boolean containsDuplicate(int[] nums) {
    int end = nums.length - 1;
    int t;
    while (end > 0) {
      boolean changed = false;
      for (int i = 0; i < end; i++) {
        if (nums[i] == nums[i + 1]) {
          return true;
        }
        if (nums[i] > nums[i + 1]) {
          ArrayUtil.swap(nums, i, i + 1);
          changed = true;
        }
      }//for end
      if (!changed) {
        break;
      }
      end--;
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(containsDuplicate(new int[]{2, 3, 1, 21, 4}));
  }
}