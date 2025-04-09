package arrays.misc;

import util.ArrayUtil;

public class ReverseArray {

  public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 45, 55, 44, 11, 22, 15, 99};

    int[] solution = new int[arr.length];
    int idx = 0;
    int low = 0;
    int high = arr.length - 1;
    reverse(arr, low, high);

    for (int j = 0; j < arr.length; j++) {
      System.out.print(" " + arr[j]);
    }
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
