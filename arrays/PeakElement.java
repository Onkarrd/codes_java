package arrays;

public class PeakElement {
    // Function to find the peak element
    // arr[]: input array
    // n: size of array a[]
    public int peakElement(int[] arr, int n) {
        if (n == 0)
            return 0;
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        System.out.println(new PeakElement().peakElement(new int[] { 5, 15, 14, 1, 1, 13, 11, 14, 2, 15, 12 }, 11));
    }
}
