package arrays.misc;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallOrLargeElement {

  public static void main(String[] args) {
    Integer[] arr = {5, 3, 8, 11, 9, 16, 3, 12};
    System.out.println("kth smallest element using sort method " + smallestElementUsingSort(arr, 4));
    System.out.println("kth largest element using sort method " + largestElementUsingSort(arr, 4));
    System.out.println("kth smallest element using priority queue " + smallestElementUsingPriorityQueue(arr, 4));
    System.out.println("kth largest element using priority queue " + largestElementUsingPriorityQueue(arr, 4));
  }

  private static int largestElementUsingPriorityQueue(Integer[] arr, int k) {
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    for (int i = 0; i < arr.length; i++) {
      queue.add(arr[i]);
      if (queue.size() > k) {
        queue.poll();
      }
    }
    return queue.peek();
  }

  private static int smallestElementUsingPriorityQueue(Integer[] arr, int k) {
    PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
    for (int i = 0; i < arr.length; i++) {
      queue.add(arr[i]);
      if (queue.size() > k) {
        queue.poll();
      }
    }
    return queue.peek();
  }

  private static int smallestElementUsingSort(Integer[] arr, int k) {
    Arrays.sort(arr);
    return arr[k - 1];
  }

  private static int largestElementUsingSort(Integer[] arr, int k) {
    Arrays.sort(arr, Collections.reverseOrder());
    return arr[k - 1];
  }


}
