package util;

import java.util.Random;

public class ArrayUtil {

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void swap(Integer[] arr, int i, int j) {
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

  public static void printArray(Integer[] arr) {
    for (int j = 0; j < arr.length; j++) {
      System.out.print(" " + arr[j]);
    }
    System.out.println("");
  }

  public static Integer[] getArray(int length) {
    Integer[] arr = new Integer[length];
    for (int j = 0; j < length; j++) {
      arr[j] = new Random().nextInt(100);
    }
    return arr;
  }
}

