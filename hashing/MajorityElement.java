package hashing;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/majority-element/description/
public class MajorityElement {

  public int majorityElement(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        map.put(nums[i], map.get(nums[i]) + 1);
      } else {
        map.put(nums[i], 1);
      }
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > nums.length / 2) {
        return entry.getKey();
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(new MajorityElement().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
  }
}
