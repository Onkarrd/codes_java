package arrays.sortings;

import java.util.ArrayList;
import java.util.List;
import util.ArrayUtil;

public class MergeSort {


  public int[] mergeSort(int[] arr) {
    mergeSortHelper(arr, 0, arr.length - 1);
    return arr;
  }

  private void mergeSortHelper(int[] arr, int low, int high) {
    if (low >= high) {
      return;
    }
    int mid = (high + low) / 2;
    mergeSortHelper(arr, low, mid);
    mergeSortHelper(arr, mid + 1, high);
    merge(arr, low, mid, high);
  }

  private void merge(int[] arr, int low, int mid, int high) {
    int left = low;
    int right = mid + 1;
    List<Integer> list = new ArrayList<>();

    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        list.add(arr[left]);
        left++;
      } else {
        list.add(arr[right]);
        right++;
      }
    }

    while (left <= mid) {
      list.add(arr[left]);
      left++;
    }
    while (right <= high) {
      list.add(arr[right]);
      right++;
    }
    for (int i = 0; i < list.size(); i++) {
      arr[low + i] = list.get(i);
    }
  }

  public static void main(String[] args) {
    ArrayUtil.printArray(new MergeSort().mergeSort(new int[]{7, 4, 1, 5, 3}));
  }
}
