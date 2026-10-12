package java.arrays.hard;

public class CountInversions {

  public static void main(String[] args) {
    System.out.println(new CountInversions().numberOfInversions(new int[]{2, 3, 7, 1, 3, 5}));
  }

  public long numberOfInversions(int[] nums) {
    return mergeSort(nums, 0, nums.length - 1);
  }

  private int merge(int[] arr, int low, int mid, int high) {
    int count = 0;
    int[] temp = new int[high - low + 1];
    int idx = 0;
    int left = low, right = mid + 1;
    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp[idx++] = arr[left++];
      } else {
        temp[idx++] = arr[right++];
        count += mid - left + 1;
      }
    }
    while (left <= mid) {
      temp[idx++] = arr[left++];
    }
    while (right <= high) {
      temp[idx++] = arr[right++];
    }
    System.arraycopy(temp, 0, arr, low, high - low + 1);
    return count;
  }

  private int mergeSort(int[] nums, int low, int high) {
    int count = 0;
    if (low < high) {
      int mid = low + (high - low) / 2;
      count += mergeSort(nums, low, mid);
      count += mergeSort(nums, mid + 1, high);
      count += merge(nums, low, mid, high);
    }
    return count;
  }
}
