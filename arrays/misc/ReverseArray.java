package arrays.misc;

import util.ArrayUtil;

class ReverseArray {

  public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 45, 55, 44, 11, 22, 15, 99};

    int[] solution = new int[arr.length];
    int idx = 0;
    int low = 0;
    int high = arr.length - 1;
    while (low < high) {
      ArrayUtil.swap(arr, low, high);
      low++;
      high--;
    }

    for (int j = 0; j < arr.length; j++) {
      System.out.print(" " + arr[j]);
    }
  }
}
