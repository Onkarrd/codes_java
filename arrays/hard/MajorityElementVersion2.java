package arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElementVersion2 {

  public static void main(String[] args) {
    System.out.println(
        new MajorityElementVersion2().majorityElement(new int[]{1, 2, 1, 1, 3, 2}));
  }

  public List<Integer> majorityElement(int[] nums) {
    // Size of the given array
    int n = nums.length;

    // Count
    int cnt1 = 0, cnt2 = 0;

    // Element
    int el = 0, e2 = 0;

    // Applying the algorithm
    for (int i = 0; i < n; i++) {
      if (cnt1 == 0 && e2 != nums[i]) {
        cnt1 = 1;
        el = nums[i];
      } else if (cnt2 == 0 && el != nums[i]) {
        cnt2 = 1;
        e2 = nums[i];
      } else if (el == nums[i]) {
        cnt1++;
      } else if (e2 == nums[i]) {
        cnt2++;
      } else {
        cnt1--;
        cnt2--;
      }
    }

    cnt1 = 0;
    cnt2 = 0;
    int mini = n / 3 + 1;
    for (int i = 0; i < n; i++) {
      if (el == nums[i]) {
        cnt1++;
      }
      if (e2 == nums[i]) {
        cnt2++;
      }
    }
    List<Integer> list = new ArrayList<>();
    // Return element if it is a majority element
    if (cnt1 >= mini) {
      list.add(el);
    }
    if (cnt2 >= mini) {
      list.add(e2);
    }
    return list;
  }
}
