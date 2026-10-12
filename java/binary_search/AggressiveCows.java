package java.binary_search;

import java.util.Arrays;

public class AggressiveCows {

  public int aggressiveCows(int[] nums, int k) {
    Arrays.sort(nums);
    int low = nums[0], high = nums[nums.length - 1], ans = -1;
    while (low < high) {
      int mid = (low + high) / 2;
      if (canPlaceCows(mid, nums, k)) {
        ans = low;
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return ans;
  }

  private boolean canPlaceCows(int distance, int[] nums, int k) {
    int cowCount = 0, lastCowStall = nums[0];
    for (int cowStall : nums) {
      if (cowStall - lastCowStall >= distance) {
        cowCount++;
      }
      if (cowCount >= k) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(new AggressiveCows().aggressiveCows(new int[]{0, 3, 4, 7, 10, 9}, 4));
  }
}
