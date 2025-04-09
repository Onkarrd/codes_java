package arrays.misc;

import java.util.ArrayList;
import java.util.List;
import util.ArrayUtil;

public class RearrangeArrayElementsBySign {

  public static void main(String[] args) {
    ArrayUtil.printArray(new RearrangeArrayElementsBySign().rearrangeArray(new int[]{-4, 4, -4, 4, -4, 4}));
  }

  public int[] rearrangeArray(int[] nums) {
    List<Integer> rearrangedPlus = new ArrayList<Integer>();
    List<Integer> rearrangedMinus = new ArrayList<Integer>();
    int i = 0, j = 0;
    for (int m = 0; m < nums.length; m++) {
      if (nums[m] > 0) {
        rearrangedPlus.add(nums[m]);
      } else {
        rearrangedMinus.add(nums[m]);
      }
    }
    System.out.println(rearrangedPlus.size() + " : " + rearrangedMinus.size());
    int[] ans = new int[nums.length];
    while (i < rearrangedPlus.size()) {
      ans[i * 2] = rearrangedPlus.get(i);
      i++;
    }
    while (j < rearrangedMinus.size()) {
      ans[j * 2 + 1] = rearrangedMinus.get(j);
      j++;
    }
    return ans;
  }

}
