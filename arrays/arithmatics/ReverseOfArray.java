package arrays.arithmatics;

import java.util.Arrays;

public class ReverseOfArray {

  public static void main(String[] args) {

  }

  public void reverse(int[] arr, int n) {
    int[] rev = new int[arr.length];
    int start = 0, end = arr.length - 1;
    while (start < end) {
      rev[end] = arr[start];
      end--;
      start++;
    }
    arr = Arrays.copyOf(rev, arr.length);
  }
}
