package arrays.searching;

import java.util.ArrayList;

public class SubSequenceSum {
  // Function to find a continuous sub-array which adds up to a given number.

  static ArrayList<Integer> subarraySum(int[] arr, int s) {
    ArrayList<Integer> pos = new ArrayList<>();
    int sum = 0, j = 0;
    for (int i = 0; i < arr.length; i++) {
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
    int[] arr = {1, 8, 2, 3, 8, 5};
    ArrayList<Integer> integers = subarraySum(arr, 12);
    for (Integer integer : integers) {
      System.out.println(integer);
    }
  }
}
