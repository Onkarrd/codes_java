package arrays.sortings;

import util.ArrayUtil;

public class BubbleSort {

  public static int counter = 0;

  public static void main(String[] args) {
    int[] a = {115, 55, 47, 31, 15};
    int n = a.length - 1;
    for (int i = n; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        {
          if (a[j] > a[j + 1]) {
            ArrayUtil.swap(a, j, j + 1);
          }
        }
        ArrayUtil.printArray(a);
      }
    }
    System.out.println(">>>");
    ArrayUtil.printArray(a);
  }
}
