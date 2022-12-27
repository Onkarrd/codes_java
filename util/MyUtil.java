package util;

import java.util.ArrayList;
import java.util.List;

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

  public static List<Employee> getEmployees(int count) {
    List<Employee> emlpoyees = new ArrayList<>();
    for (int j = 1; j <= count; j++) {
      emlpoyees.add(new Employee(j, j % 2 == 0 ? "Mark" : "Jack", j * 7));
    }
    return emlpoyees;
  }
}

