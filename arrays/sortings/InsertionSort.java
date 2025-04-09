package arrays.sortings;

import util.ArrayUtil;

public class InsertionSort {

  public static void main(String[] args) {
    int a[] = {5, 2, 0, 3, 1};
    insertionSort(a);
    ArrayUtil.printArray(a);
  }

  private static int[] insertionSort(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int j = i;
      while (j > 0 && nums[j] < nums[j - 1]) {
        int temp = nums[j];
        nums[j] = nums[j - 1];
        nums[j - 1] = temp;
        j--;
      }
    }
    return nums;
  }
}
