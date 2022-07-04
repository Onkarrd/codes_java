package util;

public class MyUtil {

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void swap(char[] arr, int i, int j) {
    char temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void printArray(int[] arr) {
    for (int j = 0; j < arr.length; j++) {
      System.out.print(" " + arr[j]);
    }
    System.out.println("");
  }
}
