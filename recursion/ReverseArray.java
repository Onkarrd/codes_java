package recursion;

import util.MyUtil;

public class ReverseArray {

  public static void main(String[] args) {
    int[] arr = {5, 3, 8, 11, 9, 16, 3, 12, 99};
    int i = 0;
    int n = arr.length;
    reverseArr(arr, i, n);
    MyUtil.printArray(arr);
  }

  private static void reverseArr(int[] arr, int i, int n) {
      if (i > n / 2) {
          return;
      }
    MyUtil.swap(arr, i, n - i - 1);
    reverseArr(arr, i + 1, n);
  }

}
