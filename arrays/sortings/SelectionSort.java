package arrays.sortings;

import util.ArrayUtil;

public class SelectionSort {

  public static int counter = 0;

  public static void main(String[] args) {
    int[] a = {41, 35, 27, 17, 15};

    for (int i = 0; i < a.length - 1; i++) {
      int min = i;
      boolean foundMin = false;
      for (int j = i + 1; j < a.length; j++) {
        if (a[j] < a[min]) {
          min = j;
          foundMin = true;
        }
        counter++;
      }
      if (!foundMin) {
        break;
      }
      ArrayUtil.swap(a, i, min);
    }

    ArrayUtil.printArray(a);
    System.out.println("counter : " + counter);
  }
}

