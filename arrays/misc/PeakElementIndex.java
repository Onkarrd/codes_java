package arrays.misc;

public class PeakElementIndex {

  // Function to find the peak element
  // arr[]: input array
  // n: size of array a[]
  public int peakElementIndex(int[] arr) {
    if (arr.length == 0) {
      return 0;
    }
    int max = arr[0];
    int maxIndex = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
        maxIndex = i;
      }
    }
    return maxIndex;
  }

  public static void main(String[] args) {
    System.out.println(new PeakElementIndex().peakElementIndex(new int[]{5, 15, 24, 31, 31, 13, 11, 14, 2, 15, 12}));
  }
}
