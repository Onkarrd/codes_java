package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//leet-code 2815. Max Pair Sum in an Array
public class MaxPairSumInArray {

  public static void main(String[] args) {
    int[] nums = {51, 71, 17, 24, 42, 727};
    System.out.println(getMaxSum(nums));
  }

  private static int getMaxSum(int[] nums) {
    Map<Integer, List<Integer>> digitMap = new HashMap<>();
    final int[] maxSum = {-1};
    for (int i = 0; i < nums.length; i++) {
      int maxDigit = 0;
      int num = nums[i];
      while (num != 0) {
        maxDigit = Math.max(num % 10, maxDigit);
        num /= 10;
      }
      if (digitMap.containsKey(maxDigit)) {
        List<Integer> sameSumNum = digitMap.get(maxDigit);
        sameSumNum.add(nums[i]);
      } else {
        List<Integer> list = new ArrayList<>();
        list.add(nums[i]);
        digitMap.put(maxDigit, list);
      }
    }
    digitMap.forEach((k, v) -> {
      if (v.size() >= 2) {
        Collections.sort(v, Collections.reverseOrder());
        int sum = v.get(0) + v.get(1);
        maxSum[0] = Math.max(sum, maxSum[0]);
      }
    });
    return maxSum[0];
  }
}
