package arrays.sortings;

import util.MyUtil;

public class BubbleSort {

  public static int counter = 0;

  public static void main(String[] args) {
    int[] a = {1, 5, 7, 1, 15};
    int n = a.length - 1;
    for (int i = 0; i < n; i++) {
      for (int j = n; j > i; j--) {
        {
          if (a[j] < a[j - 1]) {
            MyUtil.swap(a, j, j - 1);
          }
        }
        MyUtil.printArray(a);
      }
    }
    System.out.println(">>>");
    MyUtil.printArray(a);
  }
}
