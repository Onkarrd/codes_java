package hashing;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {

  public static void main(String[] args) {
    System.out.println(new MostFrequentElement().mostFrequentElement(new int[]{1, 3, 3, 2, 2}));
  }

  public int mostFrequentElement(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }
    int max = Integer.MIN_VALUE, maxFreqNumber = Integer.MAX_VALUE;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > max) {
        max = entry.getValue();
        maxFreqNumber = entry.getKey();
      } else if (max == entry.getValue()) {
        maxFreqNumber = Math.min(maxFreqNumber, entry.getKey());
      }
    }
    return maxFreqNumber;
  }
}
