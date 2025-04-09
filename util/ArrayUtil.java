package util;

import java.util.List;
import java.util.Random;

public class ArrayUtil {

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void swap(int[][] arr, int i, int j, int k, int l) {
    int temp = arr[i][j];
    arr[i][j] = arr[k][l];
    arr[k][l] = temp;
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

  public static void printMatrix(int[][] input) {
    int r = input.length, c = input[0].length;
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        //if (input[i][j] < 10) {
        System.out.print(" ");
        //}
        System.out.print("\t" + input[i][j]);
      }
      System.out.println("\n");
    }
  }

  public static int[][] formMatrix(List<Integer> input, int r, int c) {
    int[][] matrix = new int[r][c];
    int count = 0;
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        matrix[i][j] = input.get(count++);
      }
    }
    return matrix;
  }

  public static int[][] formMatrix(int r, int c) {
    int[][] matrix = new int[r][c];
    int count = 0;
    int num = 1;
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        matrix[i][j] = num++;
      }
    }
    return matrix;
  }

}

