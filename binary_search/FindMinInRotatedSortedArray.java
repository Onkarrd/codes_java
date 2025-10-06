package binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMinInRotatedSortedArray {

  public int findMin(ArrayList<Integer> arr) {
    int min = Integer.MAX_VALUE;
    int low = 0, high = arr.size() - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      min = Math.min(min, mid);
      if (arr.get(low) <= arr.get(mid)) {
        min = Math.min(min, arr.get(low));
        low = mid + 1;
      } else {
        min = Math.min(min, arr.get(mid));
        high = mid - 1;
      }
    }
    return min;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(4);
    list.add(5);
    list.add(5);
    list.add(7);
    list.add(0);
    list.add(1);
    list.add(2);
    list.add(3);
    System.out.println(new FindMinInRotatedSortedArray().findMin(list));
  }
}
