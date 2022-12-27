package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceSumWithRepeatativeElem {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4};
    int target = 4;
    List<Integer> ds = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();
    findCombinationsSum(0, arr, target, ans, ds);
    System.out.println(ans);
  }

  private static void findCombinationsSum(int i, int[] arr, int target, List<List<Integer>> ans,
      List<Integer> ds) {
    if (i == arr.length) {
      if (target == 0) {
        ans.add(new ArrayList<>(ds));
      }
      return;
    }
    if (arr[i] <= target) {
      ds.add(arr[i]);
      findCombinationsSum(i, arr, target - arr[i], ans, ds);
      ds.remove(ds.size() - 1);
    }
    findCombinationsSum(i + 1, arr, target, ans, ds);
  }
}
