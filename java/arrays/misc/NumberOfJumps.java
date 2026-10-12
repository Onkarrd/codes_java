package java.arrays.misc;

import java.arrays.sortings.MergeSort;

public class NumberOfJumps {

  public int numberOfJumps(int[] nums, int k) {
    int noOfJumps = 0;
    MergeSort.mergeSortHelper(nums, 0, nums.length - 1);
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] + k < nums[i + 1]) {
        noOfJumps += nums.length - i;
      }
    }
    return noOfJumps;
  }

  public static void main(String[] args) {
    System.out.println(new NumberOfJumps().numberOfJumps(new int[]{1, 3, 5, 6, 10}, 2));
  }

}
