package arrays.searching.easy;

public class searchInsertPosition {

  public static int searchInsert(int[] nums, int target) {
    int mid = nums.length / 2;
    if (nums[mid] == target) {
      return mid + 1;
    } else if (nums[mid] < target) {
      return searchInsertPosition(mid, nums.length - 1, target, nums);
    } else {
      return searchInsertPosition(0, mid, target, nums);
    }
  }

  public static int searchInsertPosition(int start, int end, int target, int[] nums) {
    int mid = start + end / 2;
    if (nums[mid] == target) {
      return mid + 1;
    } else if (nums[mid] < target) {
      return searchInsertPosition(mid, nums.length - 1, target, nums);
    } else {
      return searchInsertPosition(0, mid, target, nums);
    }
  }

  public static void main(String[] args) {
    System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
  }
}
