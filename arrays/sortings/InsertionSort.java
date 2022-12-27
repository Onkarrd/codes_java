package arrays.sortings;

import util.MyUtil;

public class InsertionSort {

  public static void main(String[] args) {
    int a[] = {5, 2, 0, 3, 1};
    for (int i = 1; i < a.length; i++) {
      int k = a[i];
      int j = i - 1;
      while (j >= 0 && a[j] > k) {
        a[j + 1] = a[j];
        j--;
      }
      a[j + 1] = k;
    }
    MyUtil.printArray(a);
  }
}
