package arrays.arithmatics;

import arrays.misc.ReverseArray;
import util.ArrayUtil;

public class LeftRotateArrayByKPlaces {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    new LeftRotateArrayByKPlaces().rotateArray(arr, 29);
    ArrayUtil.printArray(arr);
  }

  public void rotateArray(int[] nums, int k) {
    k = k % nums.length;
    System.out.println(k);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
    reverse(nums, 0, nums.length - 1);
  }

  public static void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }
}