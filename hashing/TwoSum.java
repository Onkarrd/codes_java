package hashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public static void main(String[] args) {
    int[] indexes = twoSum(new int[]{1, 2, 3, 4, 5}, 3);
    System.out.println(indexes[0] + "," + indexes[1]);
  }

  public static int[] twoSum(int[] nums, int target) {
    int[] indexes = new int[2];
    int count = 1;
    Map<Integer, Integer> numbers = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (numbers.containsKey(target - nums[i])) {
        indexes[0] = numbers.get(target - nums[i]);
        indexes[1] = i;
        break;
      } else {
        numbers.put(nums[i], i);
      }
      count++;
    }
    System.out.println(count);
    return indexes;
  }
}
