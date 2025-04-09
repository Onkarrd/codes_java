package arrays.sortings;

import util.ArrayUtil;

public class QuickSort {


  public static void main(String[] args) {

    ArrayUtil.printArray(new QuickSort().quickSort(new int[]{7, 4, 1, 1, 5, 5, 8, 3}));
  }

  public int[] quickSort(int[] nums) {
    quickSort(nums, 0, nums.length - 1);
    return nums;
  }

  private void quickSort(int[] nums, int low, int high) {
    if (low >= high) {
      return;
    }
    int p = partition(nums, low, high);
    quickSort(nums, low, p - 1);
    quickSort(nums, p + 1, high);
  }

  private int partition(int[] nums, int low, int high) {

    int pivot = nums[low];
    int i = low;
    int j = high;
    while (i < j) {
      while (nums[i] <= pivot && i <= high - 1) {
        i++;
      }
      while (nums[j] > pivot && j >= low + 1) {
        j--;
      }
      if (i < j) {
        swap(nums, i, j);
      }
    }
    ArrayUtil.swap(nums, j, low);
    return j;
  }

  void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
