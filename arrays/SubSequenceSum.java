package arrays;

import java.util.ArrayList;

public class SubSequenceSum {
  // Function to find a continuous sub-array which adds up to a given number.

  static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
    ArrayList<Integer> pos = new ArrayList<>();
    int sum = 0, j = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
      if (sum > s) {
        sum = 0;
        j++;
        i = j - 1;
      }
      if (sum == s) {
        pos.add(j + 1);
        pos.add(i + 1);
        return pos;
      }
    }
    pos.add(-1);
    return pos;
  }

  public static void main(String[] args) {
    int[] arr = {1, 8, 3, 7, 5};
    ArrayList<Integer> integers = subarraySum(arr, arr.length, 7);
    for (Integer integer : integers) {
      System.out.println(integer);
    }
  }
}
