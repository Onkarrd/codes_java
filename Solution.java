import java.util.HashMap;
import java.util.Map;

public class Solution {


  public static void main(String[] args) {
    System.out.println(new Solution().longestSubArrayWithSumK(new int[]{10, 5, 2, 7, 1, 9}, 15));
    System.out.println(new Solution().longestSubArrWithSumKForPosNumOnly(new int[]{10, 5, 2, 7, 1, 9}, 15));
  }

  private int longestSubArrayWithSumK(int[] nums, int k) {
    int sum = 0, len = 0, maxSubArrayLength = 0;
    Map<Integer, Integer> preSumIdx = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if (sum == k) {
        maxSubArrayLength = Math.max(len, maxSubArrayLength);
      }
      int rem = sum - k;
      if (preSumIdx.containsKey(rem)) {
        len = i - preSumIdx.get(rem);
        maxSubArrayLength = Math.max(len, maxSubArrayLength);
      }
      if (!preSumIdx.containsKey(sum)) {
        preSumIdx.put(sum, i);
      }
    }
    return maxSubArrayLength;
  }

  private int longestSubArrWithSumKForPosNumOnly(int[] nums, int k) {
    int sum = 0, p1 = 0, p2 = 0, len = 0, maxLen = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if (sum == k) {
        len = Math.abs(p2 - p1) + 1;
        maxLen = Math.max(len, maxLen);
        p1++;
      } else if (sum < k) {
        p1++;
      } else {
        sum -= nums[p2];
        p1++;
        p2++;
      }
    }
    return maxLen;
  }
}
