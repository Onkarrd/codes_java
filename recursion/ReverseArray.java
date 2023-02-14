package recursion;

import util.ArrayUtil;

public class ReverseArray {

  public static void main(String[] args) {
    int[] arr = {5, 3, 8, 11, 9, 16, 3, 12, 99};
    int i = 0;
    int n = arr.length;
    reverseArr(arr, i, n);
    ArrayUtil.printArray(arr);
  }

  private static void reverseArr(int[] arr, int i, int n) {
    if (i > n / 2) {
      return;
    }
    ArrayUtil.swap(arr, i, n - i - 1);
    reverseArr(arr, i + 1, n);
  }

}
