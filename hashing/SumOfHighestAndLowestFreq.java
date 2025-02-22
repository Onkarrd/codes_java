package hashing;

import java.util.HashMap;
import java.util.Map;

public class SumOfHighestAndLowestFreq {

  public static void main(String[] args) {
    System.out.println(new SumOfHighestAndLowestFreq().sumOfHighestAndLowestFreq(new int[]{1, 2, 3}));
  }

  public int sumOfHighestAndLowestFreq(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }
    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > max) {
        max = entry.getValue();
      }
      if (entry.getValue() < min) {
        min = entry.getValue();
      }
    }
    return max + min;
  }
}
