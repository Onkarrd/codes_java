package arrays.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LeadersInAnArray {

  public static void main(String[] args) {
    System.out.println(new LeadersInAnArray().leaders(new int[]{1, 2, 5, 3, 1, 2}));
  }

  public ArrayList<Integer> leaders(int[] nums) {
    int max = Integer.MIN_VALUE;
    ArrayList<Integer> leaders = new ArrayList<>();
    for (int i = nums.length - 1; i >= 0; i--) {
      if (nums[i] > max) {
        leaders.add(nums[i]);
        max = nums[i];
      }
    }
    leaders.sort(Collections.reverseOrder());
    return leaders;
  }
}
