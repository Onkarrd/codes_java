package binary_search;

public class SearchInsertPosition {

  public int searchInsert(int[] nums, int target) {
    int low = 0, high = nums.length - 1, mid = nums.length;
    while (low <= high) {
      mid = (low + high) / 2;
      if (nums[mid] < target) {
        low = mid + 1;
      } else if (nums[mid] >= target) {
        high = mid - 1;
      }
    }
    return mid;
  }

  public static void main(String[] args) {
    System.out.println(new SearchInsertPosition().searchInsert(
        new int[]{-97, -96, -90, -87, -86, -76, -73, -18, -16, 8, 13, 18, 56, 58, 59, 62, 64, 74, 88}
        , -55));
  }
}
