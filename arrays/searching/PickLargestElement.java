package arrays.searching;

class PickLargestElement {

  // Function to find the peak element
  // arr[]: input array
  // n: size of array a[]
  public int peakElement(int[] arr, int n) {
    return findElement(arr, 0, n - 1, n);//add code here.
  }

  private int findElement(int[] arr, int low, int high, int n) {
    int mid = low + (high - low) / 2;

    if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid] >= arr[mid + 1])) {
      return arr[mid];
    }

    if (mid > 0 && arr[mid - 1] >= arr[mid]) {
      return findElement(arr, low, mid - 1, n);
    } else {
      return findElement(arr, mid + 1, high, n);
    }
  }
}